package cn.alphahub.payment.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 退款入参上层抽象
 *
 * @author weasley
 * @version 1.0.0
 */
@Data
public abstract class AbstractRefundRequest implements Serializable {
    /**
     * 交易流水号
     */
    private String sourOrderNo;
    /**
     * 退单号
     */
    private String refundNo;
}
