package cn.alphahub.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 支付 - 高可用
 */
@SpringBootApplication
public class PaymentHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentHaApplication.class, args);
    }

}
