package com.gbank.minigame.football.entity;

import java.io.Serializable;

/**
 * <p>
 * 奖池配置表
 * </p>
 *
 * @author penggq
 * @since 2019-06-20
 */
public class ConfigJackpot implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer state;
    /**
     * 奖池id
     */
    private Integer jackpotId;
    /**
     * 奖励类型
     */
    private Integer type;
    /**
     * 奖励金额
     */
    private Double amount;
    /**
     * 抽此奖池id所需的累计值条件
     */
    private Integer accValueCondition;


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getJackpotId() {
        return jackpotId;
    }

    public void setJackpotId(Integer jackpotId) {
        this.jackpotId = jackpotId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getAccValueCondition() {
        return accValueCondition;
    }

    public void setAccValueCondition(Integer accValueCondition) {
        this.accValueCondition = accValueCondition;
    }

    public static final String STATE = "state";

    public static final String JACKPOT_ID = "jackpot_id";

    public static final String TYPE = "type";

    public static final String AMOUNT = "amount";

    public static final String ACC_VALUE_CONDITION = "acc_value_condition";

    @Override
    public String toString() {
        return "ConfigJackpot{" +
        ", state=" + state +
        ", jackpotId=" + jackpotId +
        ", type=" + type +
        ", amount=" + amount +
        ", accValueCondition=" + accValueCondition +
        "}";
    }
}
