package com.example.seckill_mybatis_reverse_engineering.db.mappers;

import com.example.seckill_mybatis_reverse_engineering.db.po.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    Order selectByOrderNo(String orderNo);
}