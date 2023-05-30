package cn.alphahub.payment.core;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Abstract Pay Client
 *
 * @author weasley
 * @version 1.0.0
 */
@Data
@Slf4j
public abstract class AbstractPayClient implements PayClient {
    private String authorization;
    private String timestamp;
    private String nonce;

    public static String sha256Sign(String appId, String appKey, String Timestamp, String Nonce, String request) {
        return null;
    }

    public static byte[] hmacSHA256(byte[] data, byte[] key) throws Exception {
        return new byte[0];
    }

    public static String mapToURIStringEncode(Map<String, String> requestMap) throws UnsupportedEncodingException {
        return null;
    }

    /**
     * 将Object解析为通知的对象,非必填参数对象中也要有
     */
    public Boolean verifyMd5Sign(Object object, String sign, String key) {
        return true;
    }
}
