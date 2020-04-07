/**
* 格式说明：每条语句之间必须用注释“@sql ”进行分割，@sql后跟sqlId
*/

-- 基于platform_tree_node，支持动态业务表组合
-- @sql select_tree_node_left_join
select
  tn.id          tn_id,
  tn.text        tn_text,
  tn.parent      tn_parent,
  tn.icon        tn_icon,
  tn.`type`      tn_type,
  tn.tree_entity tn_tree_entity,
  tn.meta        tn_meta,
  t.*
from platform_tree_node tn left join $.tableName t on tn.id = t.tree_node_id
where tn.tree_id = $.treeId

-- @sql select_platform_menu
SELECT tn.id,tn.`TEXT` name,tn.parent parentId,tn.`type` component,tn.icon icon,tn.meta,tn.tree_id treeId FROM platform_tree_node tn ,platform_app_user app WHERE tn.tree_id = app.id and app.user_id=$.userId and tn.flag='menuItem'
UNION SELECT id,`name`,'0' parentId,'default' component,icon,'' meta,id treeId FROM platform_app_user au where au.user_id=$.userId order by treeId,parentId ASC