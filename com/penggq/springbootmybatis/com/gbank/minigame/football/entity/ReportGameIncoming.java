package com.gbank.minigame.football.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author penggq
 * @since 2019-06-20
 */
public class ReportGameIncoming implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Date date;
    private Integer gameId;
    /**
     * 猜牌次数
     */
    private Integer gameNum;
    private Integer anteUserNum;
    private Long totalAnte;
    private Double totalBigJackpotReward;
    private Double totalBaseJackpotReward;
    /**
     * 手续费
     */
    private Double totalServicepay;
    private Long totalProfit;
    private Integer newAnteNum;
    private Integer newLoginNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getGameNum() {
        return gameNum;
    }

    public void setGameNum(Integer gameNum) {
        this.gameNum = gameNum;
    }

    public Integer getAnteUserNum() {
        return anteUserNum;
    }

    public void setAnteUserNum(Integer anteUserNum) {
        this.anteUserNum = anteUserNum;
    }

    public Long getTotalAnte() {
        return totalAnte;
    }

    public void setTotalAnte(Long totalAnte) {
        this.totalAnte = totalAnte;
    }

    public Double getTotalBigJackpotReward() {
        return totalBigJackpotReward;
    }

    public void setTotalBigJackpotReward(Double totalBigJackpotReward) {
        this.totalBigJackpotReward = totalBigJackpotReward;
    }

    public Double getTotalBaseJackpotReward() {
        return totalBaseJackpotReward;
    }

    public void setTotalBaseJackpotReward(Double totalBaseJackpotReward) {
        this.totalBaseJackpotReward = totalBaseJackpotReward;
    }

    public Double getTotalServicepay() {
        return totalServicepay;
    }

    public void setTotalServicepay(Double totalServicepay) {
        this.totalServicepay = totalServicepay;
    }

    public Long getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(Long totalProfit) {
        this.totalProfit = totalProfit;
    }

    public Integer getNewAnteNum() {
        return newAnteNum;
    }

    public void setNewAnteNum(Integer newAnteNum) {
        this.newAnteNum = newAnteNum;
    }

    public Integer getNewLoginNum() {
        return newLoginNum;
    }

    public void setNewLoginNum(Integer newLoginNum) {
        this.newLoginNum = newLoginNum;
    }

    public static final String ID = "id";

    public static final String DATE = "date";

    public static final String GAME_ID = "game_id";

    public static final String GAME_NUM = "game_num";

    public static final String ANTE_USER_NUM = "ante_user_num";

    public static final String TOTAL_ANTE = "total_ante";

    public static final String TOTAL_BIG_JACKPOT_REWARD = "total_big_jackpot_reward";

    public static final String TOTAL_BASE_JACKPOT_REWARD = "total_base_jackpot_reward";

    public static final String TOTAL_SERVICEPAY = "total_servicepay";

    public static final String TOTAL_PROFIT = "total_profit";

    public static final String NEW_ANTE_NUM = "new_ante_num";

    public static final String NEW_LOGIN_NUM = "new_login_num";

    @Override
    public String toString() {
        return "ReportGameIncoming{" +
        ", id=" + id +
        ", date=" + date +
        ", gameId=" + gameId +
        ", gameNum=" + gameNum +
        ", anteUserNum=" + anteUserNum +
        ", totalAnte=" + totalAnte +
        ", totalBigJackpotReward=" + totalBigJackpotReward +
        ", totalBaseJackpotReward=" + totalBaseJackpotReward +
        ", totalServicepay=" + totalServicepay +
        ", totalProfit=" + totalProfit +
        ", newAnteNum=" + newAnteNum +
        ", newLoginNum=" + newLoginNum +
        "}";
    }
}
