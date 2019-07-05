package com.gbank.minigame.football.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 常量配置表
 * </p>
 *
 * @author penggq
 * @since 2019-06-20
 */
public class ConfigConstants implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer state;
    /**
     * 常量名
     */
    private String name;
    /**
     * 常量值
     */
    private String value;
    /**
     * 注释
     */
    private String comment;
    private Date cts;
    private Date uts;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCts() {
        return cts;
    }

    public void setCts(Date cts) {
        this.cts = cts;
    }

    public Date getUts() {
        return uts;
    }

    public void setUts(Date uts) {
        this.uts = uts;
    }

    public static final String ID = "id";

    public static final String STATE = "state";

    public static final String NAME = "name";

    public static final String VALUE = "value";

    public static final String COMMENT = "comment";

    public static final String CTS = "cts";

    public static final String UTS = "uts";

    @Override
    public String toString() {
        return "ConfigConstants{" +
        ", id=" + id +
        ", state=" + state +
        ", name=" + name +
        ", value=" + value +
        ", comment=" + comment +
        ", cts=" + cts +
        ", uts=" + uts +
        "}";
    }
}
