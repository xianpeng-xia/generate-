package com.gbank.minigame.football.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author penggq
 * @since 2019-06-20
 */
public class ConfigJackpotForStar implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer state;
    /**
     * 玩家角色(黑名单、新手等)
     */
    private Integer role;
    /**
     * 星级
     */
    private Integer star;
    /**
     * 当前角色当前星级对应的抽大奖时的大奖id
     */
    private String jackpotId;


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

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getJackpotId() {
        return jackpotId;
    }

    public void setJackpotId(String jackpotId) {
        this.jackpotId = jackpotId;
    }

    public static final String STATE = "state";

    public static final String ROLE = "role";

    public static final String STAR = "star";

    public static final String JACKPOT_ID = "jackpot_id";

    @Override
    public String toString() {
        return "ConfigJackpotForStar{" +
        ", state=" + state +
        ", role=" + role +
        ", star=" + star +
        ", jackpotId=" + jackpotId +
        "}";
    }
}
