package cn.alphahub.payment.core;

import cn.alphahub.payment.entity.AbstractPayRequest;
import cn.alphahub.payment.entity.AbstractPayResponse;
import cn.alphahub.payment.entity.AbstractRefundRequest;
import cn.alphahub.payment.entity.AbstractRefundResponse;

/**
 * 支付端上层接口
 *
 * @author weasley
 * @version 1.0.0
 * @apiNote "方法入参"需要转换为各自的实现类转为具体入参对象的"实际子类"
 */
public interface PayClient {
    /**
     * 支付
     *
     * @param req 支付入参, 如: 响应H5支付入参,响应小程序miniProgram支付入参,
     * @return 响应, 返回各自具体输出的实现, 如: 响应H5支付结果,响应小程序miniProgram支付结果,
     */
    AbstractPayResponse pay(AbstractPayRequest req);


    /**
     * 发起退款
     *
     * @param req 发起退款入参
     * @return 退款结果响应
     */
    AbstractRefundResponse refund(AbstractRefundRequest req);

    /**
     * 查询支付结果
     *
     * @param req 查询支付结果入参
     * @return 查询结果
     */
    AbstractPayQueryResponse queryPay(AbstractQueryPayRequest req);

    /**
     * 查询退款结果
     *
     * @param req 查询退款入参
     * @return 退款结果信息
     */
    AbstractRefundQueryResponse queryRefund(AbstractRefundQueryRequest req);

    /**
     * 验签
     *
     * @param notifyType 0 退款 1付款
     */
    <R extends ThirdVerifyNotifyResponse> R verifyNotify(Integer notifyType, ThirdNotifyInvokerRequest thirdNotifyInvokerRequest);

}
