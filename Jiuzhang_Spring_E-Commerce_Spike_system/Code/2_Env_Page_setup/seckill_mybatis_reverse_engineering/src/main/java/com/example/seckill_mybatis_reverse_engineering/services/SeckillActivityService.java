package com.example.seckill_mybatis_reverse_engineering.services;

import com.example.seckill_mybatis_reverse_engineering.util.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeckillActivityService {
    @Autowired
    private RedisService redisService;
    /**
     * 判断商品是否还有库存
     * @param activityId 商品ID
     * @return
     */
    public boolean seckillStockValidator(long activityId) {
        String key = "stock:" + activityId;
        return redisService.stockDeductValidator(key);
    }
}
