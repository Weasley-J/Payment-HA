package cn.alphahub.payment.core.kuaiqian;

import cn.alphahub.payment.entity.AbstractPayRequest;
import cn.alphahub.payment.entity.AbstractPayResponse;
import cn.alphahub.payment.entity.AbstractRefundRequest;
import cn.alphahub.payment.entity.AbstractRefundResponse;

/**
 * Enter the description of this class here
 *
 * @author weasley
 * @version 1.0.0
 */
public class KuaiqianMisposClient extends AbstractKuaiqianPayClient {
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

    @Override
    public void init() {

    }
}
