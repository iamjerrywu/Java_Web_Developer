package com.example.seckill_mybatis_reverse_engineering.db.dao;

import com.example.seckill_mybatis_reverse_engineering.db.po.SeckillCommodity;

public interface SeckillCommodityDao {

    public SeckillCommodity querySeckillCommodityById(long commodityId);
}