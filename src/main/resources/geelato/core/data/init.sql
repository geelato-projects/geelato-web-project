-- 格式说明：每条语句之间必须用注释“--”进行分割
-- 启动时加载初始化

-- 初始化角色
-- @sql init_sys_role
INSERT INTO sys_role (id,creator,create_at,updater,update_at,description,code,name,check_status)
VALUES
  (1,1,NOW(),1,NOW(),'普通用户，拥有最基本个人信息管理等的权限','base_user','普通用户',0),
  (2,1,NOW(),1,NOW(),'超级用户（管理层），拥有最基本个人信息管理等的权限，以及查看有应用系统的权限','super_user','超级用户',0),
  (3,1,NOW(),1,NOW(),'应用管理员，拥有应用运行参数配置基本权限，人员角色分配权限','admin','应用管理员',0),
  (4,1,NOW(),1,NOW(),'平台技术员，拥有较高平台开发配置权限，维护平台的稳定，添加新功能特性','op','平台技术员',0),
  (5,1,NOW(),1,NOW(),'超级管理员，拥有最高的权限','super_admin','平台维护员',0);

-- 初始化管理员账号 super_admin/123456
-- @sql init_sys_user
INSERT INTO sys_user (id,PASSWORD,creator,create_at,updater,update_at,salt,login_name,NAME,description,avatar,check_status)
  SELECT 1,'1780a6e404d4d40c7f48cf3a9ad06529c70d7932',1,NOW(),1,NOW(),'9305eae06a145483','super_admin','超级管理员',NULL,NULL,0 FROM DUAL
  WHERE NOT EXISTS (SELECT * FROM sys_user WHERE login_name='super_admin');



-- 初始模块信息、菜单信息
-- @sql init_sys_app
INSERT INTO sys_app(id,creator,create_at,updater,update_at,code,name,icon,href,depend_app_code,menu,seq,description,check_status)
VALUES
  (1,1,NOW(),1,NOW(),'dev','开发工具','','/m/dev/table_config/index','md,sys',null,1,'面向开发人员的配置工具',0),
  (2,1,NOW(),1,NOW(),'md','元数据管理','','/m/md/data_dynamic/index','',null,2,'系统元数据信息',0),
  (3,1,NOW(),1,NOW(),'sys','系统管理','','/m/sys/user/index','md',null,3,'面向系统管理员的日常配置管理工具',0),
  (4,1,NOW(),1,NOW(),'pd','物流管理','','m/pd/bin/index','md',null,4,'物流管理',0);

-- 初始化字典目录
-- INSERT INTO `md_data_item_catalog`(create_at,creator,code,name,description,update_at,updater,check_status)
-- VALUES (NOW(), 1, 'DATA_TYPE', '数据类型', '', NOW(), 1,0);

-- 初始化字典信息
-- INSERT INTO `md_data_item`
-- (creator,update_at,name,inbuilt,description,type,updater,group_code,name,md_data_item_catalog_id,group_code,create_at,check_status)
-- VALUES
--   (1,NOW(), 'string', 1, '', 'string', 1, '数据类型', '字符串(string)', 1, 'DATA_TYPE', NOW(),0),
--   (1,NOW(), 'number', 1, '', 'string', 1, '数据类型', '数值(number)', 1, 'DATA_TYPE', NOW(),0),
--   (1,NOW(), 'date', 1, '', 'string', 1, '数据类型', '日期(date)', 1, 'DATA_TYPE', NOW(),0),
--   (1,NOW(), 'eunm', 1, '', 'string', 1, '数据类型', '枚举(eunm)', 1, 'DATA_TYPE', NOW(),0),
--   (1,NOW(), 'boolean', 1, '', 'string', 1, '数据类型', '布尔(boolean)', 1, 'DATA_TYPE', NOW(),0);

-- 初始化系统配置
INSERT INTO `sys_common_general_config`(id,create_at,creator,update_at,updater,name,code,value,seq,description,check_status)
VALUES (1,NOW(), 1, NOW(), 1, '平台启动应用', 'START_APP', 'dev',1, '平台启动时触发的应用',0);
