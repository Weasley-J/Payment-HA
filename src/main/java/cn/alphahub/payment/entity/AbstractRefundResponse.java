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
public abstract class AbstractRefundResponse<R extends Serializable, E extends Serializable> implements Serializable {
    /**
     * 三方交易流水号
     */
    private String thirdTransactionNo;
    /**
     * 三方支付结果
     */
    private R result;
    /**
     * 期望的返回结果
     */
    private E expect;
}
