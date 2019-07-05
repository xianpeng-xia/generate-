package com.gbank.minigame.football.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
public class UserAccValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer type;
    private Integer typeId;
    private Double accValue;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Double getAccValue() {
        return accValue;
    }

    public void setAccValue(Double accValue) {
        this.accValue = accValue;
    }

    public static final String ID = "id";

    public static final String USER_ID = "user_id";

    public static final String TYPE = "type";

    public static final String TYPE_ID = "type_id";

    public static final String ACC_VALUE = "acc_value";

    @Override
    public String toString() {
        return "UserAccValue{" +
        ", id=" + id +
        ", userId=" + userId +
        ", type=" + type +
        ", typeId=" + typeId +
        ", accValue=" + accValue +
        "}";
    }
}
