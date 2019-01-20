/**
* 格式说明：每条语句之间必须用注释“@sql ”进行分割，@sql后跟sqlId
*/

-- 基于platform_tree_node，支持动态业务表组合
-- @sql select_tree_node_left_join
select
  tn.id          tn_id,
  tn.parent      tn_parent,
  tn.icon        tn_icon,
  tn.`type`      tn_type,
  tn.tree_entity tn_tree_entity,
  tn.meta        tn_meta,
  t.*
from platform_tree_node tn left join $.tableName t on tn.id = t.tree_node_id
where tn.tree_id = $.treeId