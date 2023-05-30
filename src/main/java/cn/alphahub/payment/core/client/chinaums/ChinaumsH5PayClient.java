package cn.alphahub.payment.core.client.chinaums;

import cn.alphahub.payment.core.AbstractPayClient;
import cn.alphahub.payment.entity.AbstractPayRequest;
import cn.alphahub.payment.entity.AbstractPayResponse;
import cn.alphahub.payment.entity.AbstractRefundRequest;
import cn.alphahub.payment.entity.AbstractRefundResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * Enter the description of this class here
 *
 * @author weasley
 * @version 1.0.0
 */
@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class ChinaumsH5PayClient extends AbstractPayClient {
    @Override
    public AbstractPayResponse pay(AbstractPayRequest req) {
        return null;
    }

    @Override
    public AbstractRefundResponse refund(AbstractRefundRequest req) {
        return null;
    }

    @Override
    public AbstractPayQueryResponse queryPay(AbstractQueryPayRequest req) {
        return null;
    }

    @Override
    public AbstractRefundQueryResponse queryRefund(AbstractRefundQueryRequest req) {
        return null;
    }

    @Override
    public <R extends ThirdVerifyNotifyResponse> R verifyNotify(Integer notifyType, ThirdNotifyInvokerRequest thirdNotifyInvokerRequest) {
        return null;
    }
}
