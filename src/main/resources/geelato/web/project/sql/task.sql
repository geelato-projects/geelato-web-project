/**
* 格式说明：每条语句之间必须用注释“@sql ”进行分割，@sql后跟sqlId
*/

-- @sql prj_task_list
SELECT t.*,p.name FROM prj_task t,prj_project_info p where t.project_id=p.id