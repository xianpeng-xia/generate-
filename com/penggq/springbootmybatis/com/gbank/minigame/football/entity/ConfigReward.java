package com.gbank.minigame.football.entity;

import java.io.Serializable;

/**
 * <p>
 * 中奖概率配置表
 * </p>
 *
 * @author penggq
 * @since 2019-06-20
 */
public class ConfigReward implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer state;
    /**
     * 玩家角色（新手/黑名单等角色）
     */
    private Integer role;
    /**
     * 中奖后赢取倍率
     */
    private Double multi;
    /**
     * 玩家当前星位
     */
    private Integer star;
    /**
     * 对应倍率和星位的中奖概率
     */
    private Double rate;


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Double getMulti() {
        return multi;
    }

    public void setMulti(Double multi) {
        this.multi = multi;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public static final String STATE = "state";

    public static final String ROLE = "role";

    public static final String MULTI = "multi";

    public static final String STAR = "star";

    public static final String RATE = "rate";

    @Override
    public String toString() {
        return "ConfigReward{" +
        ", state=" + state +
        ", role=" + role +
        ", multi=" + multi +
        ", star=" + star +
        ", rate=" + rate +
        "}";
    }
}
