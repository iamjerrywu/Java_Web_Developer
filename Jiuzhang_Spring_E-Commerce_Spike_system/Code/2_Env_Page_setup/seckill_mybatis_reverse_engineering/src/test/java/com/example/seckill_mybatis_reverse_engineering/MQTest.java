package com.example.seckill_mybatis_reverse_engineering;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class MQTest {
    @Autowired
    com.jiuzhang.seckill.mq.RocketMQService rocketMQService;
    @Test
    public void sendMQTest() throws Exception {
        rocketMQService.sendMessage("test-jiuzhang", "Hello World!" + new Date().toString());
    }
}
