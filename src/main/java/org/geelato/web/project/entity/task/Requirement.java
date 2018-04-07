package org.geelato.web.project.entity.task;

import org.geelato.core.meta.annotation.Entity;
import org.geelato.core.meta.annotation.Title;
import org.geelato.core.meta.model.entity.BaseEntity;

@Entity(name = "prj_req")
@Title(title = "需求")
public class Requirement extends BaseEntity{
    private String title;
    private String src;
    private String priority;
    private Long submitter;
    private Long assignor;
    private String fixVersion;
    private Long projectId;
    private String description;
    private int seq;
}
