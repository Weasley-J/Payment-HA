package cn.alphahub.payment.core.client.kuaiqian;

import io.micrometer.common.util.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.List;
import java.util.Map;

/**
 * Enter the description of this class here
 *
 * @author weasley
 * @version 1.0.0
 */
@Slf4j
public abstract class AbstractKuaiqianPayClient implements KuaiqianPayClient {
    public static String md5SignWithoutConnector(String HEX_CHARS, List<String> orderedMapKeys, Map<String, String> param) {
        return null;
    }

    public static String sha256sign(Map<String, String> paramMap, PrivateKey privateKey) {
        return null;
    }

    public static String sha256sign(String signStr, PrivateKey privateKey) {
        return null;

    }

    public static boolean sha256Veify(String originalSign, Map<String, String> paramMap, PublicKey publicKey) {
        return true;
    }

    public static boolean verifySign(String ENCRYP_TYPE, String data, String originSign, PublicKey publicKey) {
        return true;
    }

    public static String mapToURIString(Map<String, String> requestMap) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String key : requestMap.keySet()) {
            if (StringUtils.isNotBlank(requestMap.get(key))) {
                sb.append(key);
                sb.append("=");
                sb.append(requestMap.get(key));
                if (i < requestMap.size() - 1) {
                    sb.append("&");
                }
                i++;
            }

        }
        return removeURIStringBlank(sb.toString());
    }

    private static String removeURIStringBlank(String s) {
        String result = "";
        if (null != s && !"".equals(s)) {
            result = s.replaceAll("[�?*| *| *|\\s*]*", "");
        }
        return result;
    }

    /**
     * 加密并签名
     */
    public static String signAndEncrypt(String memberCode, byte[] originalData) throws Exception {
        return null;
    }

    /**
     * client 初始化方法
     */
    public abstract void init();
}
