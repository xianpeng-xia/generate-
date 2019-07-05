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
public class AdminLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String type;
    private Integer state;
    private String operation;
    private Date cts;
    private String operateAccount;
    private String oldValue;
    private String newValue;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Date getCts() {
        return cts;
    }

    public void setCts(Date cts) {
        this.cts = cts;
    }

    public String getOperateAccount() {
        return operateAccount;
    }

    public void setOperateAccount(String operateAccount) {
        this.operateAccount = operateAccount;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public static final String ID = "id";

    public static final String TYPE = "type";

    public static final String STATE = "state";

    public static final String OPERATION = "operation";

    public static final String CTS = "cts";

    public static final String OPERATE_ACCOUNT = "operate_account";

    public static final String OLD_VALUE = "old_value";

    public static final String NEW_VALUE = "new_value";

    @Override
    public String toString() {
        return "AdminLog{" +
        ", id=" + id +
        ", type=" + type +
        ", state=" + state +
        ", operation=" + operation +
        ", cts=" + cts +
        ", operateAccount=" + operateAccount +
        ", oldValue=" + oldValue +
        ", newValue=" + newValue +
        "}";
    }
}
