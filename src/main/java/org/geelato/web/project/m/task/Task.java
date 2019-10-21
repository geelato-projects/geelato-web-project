package org.geelato.web.project.m.task;


import org.geelato.core.meta.annotation.Col;
import org.geelato.core.meta.annotation.Entity;
import org.geelato.core.meta.annotation.Title;
import org.geelato.core.meta.model.entity.BaseEntity;

@Entity(name = "prj_task")
@Title(title = "任务")
public class Task extends BaseEntity {
    private String title;
    private String type;
    private String priority;
    private Long submitter;
    private Long assignor;
    private String fixVersion;
    private Long projectId;
    private String description;
    private int seq;


    public Task() {
    }

    public Task(Long id) {
        this.setId(id);
    }

    @Title(title = "标题")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Title(title = "类型")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Title(title = "优先级")
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Title(title = "提交者")
    public Long getSubmitter() {
        return submitter;
    }

    public void setSubmitter(Long submitter) {
        this.submitter = submitter;
    }

    @Title(title = "指派者")
    public Long getAssignor() {
        return assignor;
    }

    public void setAssignor(Long assignor) {
        this.assignor = assignor;
    }

    @Title(title = "修复版本")
    public String getFixVersion() {
        return fixVersion;
    }

    public void setFixVersion(String fixVersion) {
        this.fixVersion = fixVersion;
    }

    @Col(name = "project_id")
    @Title(title = "所属项目")
    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    @Title(title = "次序")
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    @Title(title = "描述")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
