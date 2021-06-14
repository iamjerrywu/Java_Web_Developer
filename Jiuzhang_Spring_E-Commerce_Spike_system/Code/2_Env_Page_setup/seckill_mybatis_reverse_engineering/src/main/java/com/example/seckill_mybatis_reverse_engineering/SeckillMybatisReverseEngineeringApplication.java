package com.example.seckill_mybatis_reverse_engineering;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.seckill_mybatis_reverse_engineering.db.mappers")
@ComponentScan(basePackages = {"com.example"})
public class SeckillMybatisReverseEngineeringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillMybatisReverseEngineeringApplication.class, args);
    }

}
