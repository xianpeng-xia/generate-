package com.gbank.minigame.football.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 投注档位表
 * </p>
 *
 * @author penggq
 * @since 2019-06-20
 */
public class ConfigAnteLevel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer state;
    /**
     * 档位标记
     */
    private Double level;
    private Integer minMoney;
    private Integer maxMoney;
    private Date cts;
    private Date uts;


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Double getLevel() {
        return level;
    }

    public void setLevel(Double level) {
        this.level = level;
    }

    public Integer getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(Integer minMoney) {
        this.minMoney = minMoney;
    }

    public Integer getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(Integer maxMoney) {
        this.maxMoney = maxMoney;
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

    public static final String STATE = "state";

    public static final String LEVEL = "level";

    public static final String MIN_MONEY = "min_money";

    public static final String MAX_MONEY = "max_money";

    public static final String CTS = "cts";

    public static final String UTS = "uts";

    @Override
    public String toString() {
        return "ConfigAnteLevel{" +
        ", state=" + state +
        ", level=" + level +
        ", minMoney=" + minMoney +
        ", maxMoney=" + maxMoney +
        ", cts=" + cts +
        ", uts=" + uts +
        "}";
    }
}
