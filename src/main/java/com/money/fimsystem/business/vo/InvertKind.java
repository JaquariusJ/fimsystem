package com.money.fimsystem.business.vo;

import java.io.Serializable;
import java.util.Date;

public class InvertKind implements Serializable {
    private Integer id;

    private String code;

    private String name;

    private Integer invertTypeId;

    private Integer ristTypeId;

    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String updateBy;

    private static final long serialVersionUID = 1L;

    public InvertKind(Integer id, String code, String name, Integer invertTypeId, Integer ristTypeId, Date createTime, Date updateTime, String createBy, String updateBy) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.invertTypeId = invertTypeId;
        this.ristTypeId = ristTypeId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createBy = createBy;
        this.updateBy = updateBy;
    }

    public InvertKind() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getInvertTypeId() {
        return invertTypeId;
    }

    public void setInvertTypeId(Integer invertTypeId) {
        this.invertTypeId = invertTypeId;
    }

    public Integer getRistTypeId() {
        return ristTypeId;
    }

    public void setRistTypeId(Integer ristTypeId) {
        this.ristTypeId = ristTypeId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}