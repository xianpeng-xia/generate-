package com.gbank.minigame.football.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 玩家每局游戏的押注与输赢结果记录
 * </p>
 *
 * @author penggq
 * @since 2019-06-20
 */
public class UserFootballLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer state;
    private Integer userId;
    /**
     * 事件
     */
    private String event;
    private Date cts;
    /**
     * 下注金额
     */
    private Integer ante;
    /**
     * 当前星级
     */
    private Integer star;
    /**
     * 押注的角度，1：1.2倍，2：1.5倍, 3:2.0倍, 4：2.4倍
     */
    private Integer angle;
    /**
     * 加注倍数
     */
    private Integer multi;
    /**
     * 是否获胜，1：是，0：不是
     */
    private Integer isWin;
    /**
     * 随机数
     */
    private Double random;
    /**
     * 服务费(税收)
     */
    private Double servicePay;
    /**
     * 奖池税
     */
    private Double bigJackpotTax;
    /**
     * 个人奖池税
     */
    private Double selfTax;
    /**
     * 下注金额分配到彩票池的部分
     */
    private Double lotteryTax;
    /**
     * 基础奖池
     */
    private Double baseJackpot;
    /**
     * 从基础奖池赢取的筹码
     */
    private Double rewardBaseJackpot;
    /**
     * 从彩池中奖的筹码
     */
    private Double rewardBigJackpot;
    /**
     * 彩池返奖id
     */
    private Integer rewardBigJackpotId;
    /**
     * 从个人奖池赢取的筹码
     */
    private Double rewardSelfJackpot;
    /**
     * 赢取的总筹码
     */
    private Double rewardTotal;
    /**
     * 净收入
     */
    private Double profit;
    /**
     * 本局完成后玩家筹码数量
     */
    private Double userChipAmount;
    /**
     * 一局游戏的唯一标志id
     */
    private String roundUuid;
    /**
     * 本条记录的扣款订单号
     */
    private String orderNoDecr;
    /**
     * 返奖时的订单uuid
     */
    private String orderNoIncr;
    /**
     * 调付费接口的真实返奖金额
     */
    private Double realReward;
    /**
     * 是否赠送彩票
     */
    private Integer lotteryResult;


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

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getCts() {
        return cts;
    }

    public void setCts(Date cts) {
        this.cts = cts;
    }

    public Integer getAnte() {
        return ante;
    }

    public void setAnte(Integer ante) {
        this.ante = ante;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getAngle() {
        return angle;
    }

    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    public Integer getMulti() {
        return multi;
    }

    public void setMulti(Integer multi) {
        this.multi = multi;
    }

    public Integer getIsWin() {
        return isWin;
    }

    public void setIsWin(Integer isWin) {
        this.isWin = isWin;
    }

    public Double getRandom() {
        return random;
    }

    public void setRandom(Double random) {
        this.random = random;
    }

    public Double getServicePay() {
        return servicePay;
    }

    public void setServicePay(Double servicePay) {
        this.servicePay = servicePay;
    }

    public Double getBigJackpotTax() {
        return bigJackpotTax;
    }

    public void setBigJackpotTax(Double bigJackpotTax) {
        this.bigJackpotTax = bigJackpotTax;
    }

    public Double getSelfTax() {
        return selfTax;
    }

    public void setSelfTax(Double selfTax) {
        this.selfTax = selfTax;
    }

    public Double getLotteryTax() {
        return lotteryTax;
    }

    public void setLotteryTax(Double lotteryTax) {
        this.lotteryTax = lotteryTax;
    }

    public Double getBaseJackpot() {
        return baseJackpot;
    }

    public void setBaseJackpot(Double baseJackpot) {
        this.baseJackpot = baseJackpot;
    }

    public Double getRewardBaseJackpot() {
        return rewardBaseJackpot;
    }

    public void setRewardBaseJackpot(Double rewardBaseJackpot) {
        this.rewardBaseJackpot = rewardBaseJackpot;
    }

    public Double getRewardBigJackpot() {
        return rewardBigJackpot;
    }

    public void setRewardBigJackpot(Double rewardBigJackpot) {
        this.rewardBigJackpot = rewardBigJackpot;
    }

    public Integer getRewardBigJackpotId() {
        return rewardBigJackpotId;
    }

    public void setRewardBigJackpotId(Integer rewardBigJackpotId) {
        this.rewardBigJackpotId = rewardBigJackpotId;
    }

    public Double getRewardSelfJackpot() {
        return rewardSelfJackpot;
    }

    public void setRewardSelfJackpot(Double rewardSelfJackpot) {
        this.rewardSelfJackpot = rewardSelfJackpot;
    }

    public Double getRewardTotal() {
        return rewardTotal;
    }

    public void setRewardTotal(Double rewardTotal) {
        this.rewardTotal = rewardTotal;
    }

    public Double getProfit() {
        return profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Double getUserChipAmount() {
        return userChipAmount;
    }

    public void setUserChipAmount(Double userChipAmount) {
        this.userChipAmount = userChipAmount;
    }

    public String getRoundUuid() {
        return roundUuid;
    }

    public void setRoundUuid(String roundUuid) {
        this.roundUuid = roundUuid;
    }

    public String getOrderNoDecr() {
        return orderNoDecr;
    }

    public void setOrderNoDecr(String orderNoDecr) {
        this.orderNoDecr = orderNoDecr;
    }

    public String getOrderNoIncr() {
        return orderNoIncr;
    }

    public void setOrderNoIncr(String orderNoIncr) {
        this.orderNoIncr = orderNoIncr;
    }

    public Double getRealReward() {
        return realReward;
    }

    public void setRealReward(Double realReward) {
        this.realReward = realReward;
    }

    public Integer getLotteryResult() {
        return lotteryResult;
    }

    public void setLotteryResult(Integer lotteryResult) {
        this.lotteryResult = lotteryResult;
    }

    public static final String ID = "id";

    public static final String STATE = "state";

    public static final String USER_ID = "user_id";

    public static final String EVENT = "event";

    public static final String CTS = "cts";

    public static final String ANTE = "ante";

    public static final String STAR = "star";

    public static final String ANGLE = "angle";

    public static final String MULTI = "multi";

    public static final String IS_WIN = "is_win";

    public static final String RANDOM = "random";

    public static final String SERVICE_PAY = "service_pay";

    public static final String BIG_JACKPOT_TAX = "big_jackpot_tax";

    public static final String SELF_TAX = "self_tax";

    public static final String LOTTERY_TAX = "lottery_tax";

    public static final String BASE_JACKPOT = "base_jackpot";

    public static final String REWARD_BASE_JACKPOT = "reward_base_jackpot";

    public static final String REWARD_BIG_JACKPOT = "reward_big_jackpot";

    public static final String REWARD_BIG_JACKPOT_ID = "reward_big_jackpot_id";

    public static final String REWARD_SELF_JACKPOT = "reward_self_jackpot";

    public static final String REWARD_TOTAL = "reward_total";

    public static final String PROFIT = "profit";

    public static final String USER_CHIP_AMOUNT = "user_chip_amount";

    public static final String ROUND_UUID = "round_uuid";

    public static final String ORDER_NO_DECR = "order_no_decr";

    public static final String ORDER_NO_INCR = "order_no_incr";

    public static final String REAL_REWARD = "real_reward";

    public static final String LOTTERY_RESULT = "lottery_result";

    @Override
    public String toString() {
        return "UserFootballLog{" +
        ", id=" + id +
        ", state=" + state +
        ", userId=" + userId +
        ", event=" + event +
        ", cts=" + cts +
        ", ante=" + ante +
        ", star=" + star +
        ", angle=" + angle +
        ", multi=" + multi +
        ", isWin=" + isWin +
        ", random=" + random +
        ", servicePay=" + servicePay +
        ", bigJackpotTax=" + bigJackpotTax +
        ", selfTax=" + selfTax +
        ", lotteryTax=" + lotteryTax +
        ", baseJackpot=" + baseJackpot +
        ", rewardBaseJackpot=" + rewardBaseJackpot +
        ", rewardBigJackpot=" + rewardBigJackpot +
        ", rewardBigJackpotId=" + rewardBigJackpotId +
        ", rewardSelfJackpot=" + rewardSelfJackpot +
        ", rewardTotal=" + rewardTotal +
        ", profit=" + profit +
        ", userChipAmount=" + userChipAmount +
        ", roundUuid=" + roundUuid +
        ", orderNoDecr=" + orderNoDecr +
        ", orderNoIncr=" + orderNoIncr +
        ", realReward=" + realReward +
        ", lotteryResult=" + lotteryResult +
        "}";
    }
}
