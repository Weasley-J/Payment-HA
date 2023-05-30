package cn.alphahub.payment.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 支付入参上层抽象
 *
 * @author weasley
 * @version 1.0.0
 */
@Data
public abstract class AbstractPayRequest implements Serializable {
    /**
     * 交易流水号
     */
    private String payNo;
    /**
     * 交易流水号
     */
    private String orderNo;
    /**
     * 订单来源
     */
    private int orderSource;
    /**
     * appid
     * 微信小程序就传 小程序的appid
     * 微信内部h5 传公众号的appid
     * 纯h5也传公众号的appid
     * h5 放到app里面 也传公众号的appid
     */
    private String appId;

    /**
     * 支付环境:
     * NATIVE_APP,
     * H5INAPP,
     * WX_MINI,
     * H5INWX,
     * H5,
     */
    private String payEnv;
    /**
     * 商户编号
     */
    private String merchantCode;
    /**
     * 订单号不能
     */
    private String combineNo;
    /**
     * 付款金额（总金额）
     */
    private BigDecimal combineAmount;
    /**
     * 预支付ID不能为空
     */
    private String pageUuid;
    /**
     * 特殊业务来源
     * audiologist : 听力师业务
     * globalBuy1 : 全球购
     */
    private String bizSource;
    /**
     * 全局活动码
     **/
    private String globalActivityId;
    /**
     * 全局推广渠道码
     **/
    private String globalChannelId;

    private String sceneCode;

    private Integer systemId;

    private String posSn;

    private String submitUserId;

    /**
     * 仅商城使用
     * 0 默认
     * 1 全球购
     */
    private String orderType;
    private String goodsDesc;
    private String openid;
    private String redirectUrl;
    private String requestIp;
    private String appScheme;
}
