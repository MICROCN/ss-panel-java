package com.potec.pojo;

import java.util.Date;

/**
 * Created by pohoulong on 2018/1/14.
 */
public class BaseEntity {

    private Integer creator;

    private Date createTime = new Date();

    private Integer reviser;

    private Date reviserTime;

    private String dataStatus = "001";

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getReviser() {
        return reviser;
    }

    public void setReviser(Integer reviser) {
        this.reviser = reviser;
    }

    public Date getReviserTime() {
        return reviserTime;
    }

    public void setReviserTime(Date reviserTime) {
        this.reviserTime = reviserTime;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String toString() {
        return "BaseEntity{" +
                "creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", reviser='" + reviser + '\'' +
                ", reviserTime=" + reviserTime +
                ", dataStatus='" + dataStatus + '\'' +
                '}';
    }
}
