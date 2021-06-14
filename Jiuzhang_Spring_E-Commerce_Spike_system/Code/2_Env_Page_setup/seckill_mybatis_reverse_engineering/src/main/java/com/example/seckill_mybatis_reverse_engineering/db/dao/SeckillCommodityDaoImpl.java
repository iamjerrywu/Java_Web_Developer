package com.example.seckill_mybatis_reverse_engineering.db.dao;

import com.example.seckill_mybatis_reverse_engineering.db.mappers.SeckillCommodityMapper;
import com.example.seckill_mybatis_reverse_engineering.db.po.SeckillCommodity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class SeckillCommodityDaoImpl implements SeckillCommodityDao {

    @Resource
    private SeckillCommodityMapper seckillCommodityMapper;

    @Override
    public SeckillCommodity querySeckillCommodityById(long commodityId) {
        return seckillCommodityMapper.selectByPrimaryKey(commodityId);
    }
}