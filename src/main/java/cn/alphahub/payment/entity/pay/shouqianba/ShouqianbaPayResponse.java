package cn.alphahub.payment.entity.pay.shouqianba;

import cn.alphahub.payment.entity.AbstractPayResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Enter the description of this class here
 *
 * @author weasley
 * @version 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ShouqianbaPayResponse extends AbstractPayResponse {
    /**
     * 支付结果
     */
    private Object result;
}
