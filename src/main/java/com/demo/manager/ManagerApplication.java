package com.demo.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ProviderApplication.java
 * @Description TODO
 * @createTime 2022年05月31日 11:14:00
 */
@SpringBootApplication
@MapperScan("com.demo.manager.mymapper")
public class ManagerApplication {
    public static void main(String[] args){
        SpringApplication.run(ManagerApplication.class,args);
    }
}
