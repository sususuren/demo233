package com.xiaodu.test418;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaodu.test418.dao")
public class Test418Application {

    public static void main(String[] args) {
        SpringApplication.run(Test418Application.class, args);
    }

}
