package com.wanfangdata.weekly.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author meibaorui
 * @since 2018-06-06
 */
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 岗位id
     */
    private String positionId;
    /**
     * 岗位序列名
     */
    private String positionSequenceName;
    /**
     * 岗位等级
     */
    private String positionLevel;


    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionSequenceName() {
        return positionSequenceName;
    }

    public void setPositionSequenceName(String positionSequenceName) {
        this.positionSequenceName = positionSequenceName;
    }

    public String getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

    @Override
    public String toString() {
        return "Position{" +
        ", positionId=" + positionId +
        ", positionSequenceName=" + positionSequenceName +
        ", positionLevel=" + positionLevel +
        "}";
    }
}
