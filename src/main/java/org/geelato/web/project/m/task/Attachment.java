package org.geelato.web.project.m.task;

import org.geelato.core.meta.annotation.Entity;
import org.geelato.core.meta.annotation.Title;
import org.geelato.core.meta.model.entity.BaseEntity;

@Entity(name = "prj_attachment")
@Title(title = "附件")
public class Attachment extends BaseEntity {

    private Long fileId;

    @Title(title = "文件", description = "引用通用文件表中的id")
    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }
}
