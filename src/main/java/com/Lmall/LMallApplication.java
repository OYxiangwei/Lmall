package com.Lmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author  oy_xw
 * @qq交流 992543768
 * @email 992543768@qq.com
 *
 */
@MapperScan("com.Lmall.dao")
@SpringBootApplication
public class LMallApplication {
    public static void main(String[] args) {
        SpringApplication.run(LMallApplication.class, args);
    }
}
