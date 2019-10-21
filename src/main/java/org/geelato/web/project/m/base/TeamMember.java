package org.geelato.web.project.m.base;

import org.geelato.core.meta.annotation.Entity;
import org.geelato.core.meta.annotation.Title;
import org.geelato.core.meta.model.entity.BaseEntity;

/**
 * @author geemeta
 */
@Entity(name = "prj_team_member")
@Title(title = "团队")
public class TeamMember extends BaseEntity{
    private Long projectId;
    private Long userId;
    private String memberType;
    private String description;

    @Title(title = "所属项目")
    public Long getProjectId() {
        return projectId;
    }

    @Title(title = "人员")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    @Title(title = "成员职务")
    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Title(title = "描述")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

