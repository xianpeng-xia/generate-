package com.gbank.minigame.football.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用户连接记录表
 * </p>
 *
 * @author penggq
 * @since 2019-06-20
 */
public class LoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer state;
    private Integer userId;
    /**
     * socket连接时间
     */
    private Date startTime;
    /**
     * socket断开时间
     */
    private Date endTime;
    private String ip;
    /**
     * 会话id
     */
    private String sessionId;


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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public static final String ID = "id";

    public static final String STATE = "state";

    public static final String USER_ID = "user_id";

    public static final String START_TIME = "start_time";

    public static final String END_TIME = "end_time";

    public static final String IP = "ip";

    public static final String SESSION_ID = "session_id";

    @Override
    public String toString() {
        return "LoginLog{" +
        ", id=" + id +
        ", state=" + state +
        ", userId=" + userId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", ip=" + ip +
        ", sessionId=" + sessionId +
        "}";
    }
}
