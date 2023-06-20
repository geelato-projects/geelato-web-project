package org.geelato.web.crm.m.task;


import org.geelato.core.meta.annotation.Entity;
import org.geelato.core.meta.annotation.Title;
import org.geelato.core.meta.model.entity.BaseEntity;

@Entity(name = "prj_task_type")
@Title(title = "任务")
public class TaskType extends BaseEntity {
    private String name;
    private String code;
    private String description;

    public TaskType() {
    }

    public TaskType(String id) {
        this.setId(id);
    }

    @Title(title = "名称")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Title(title = "编码")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Title(title = "描述")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
