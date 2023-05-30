package cn.alphahub.payment.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 支付响应上层抽象
 *
 * @author weasley
 * @version 1.0.0
 */
@Data
public abstract class AbstractPayResponse implements Serializable {
    /**
     * 三方交易流水号
     */
    private String thirdTransactionNo;
}
