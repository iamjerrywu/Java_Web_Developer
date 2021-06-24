package com.example.seckill_mybatis_reverse_engineering.db.dao;

import com.example.seckill_mybatis_reverse_engineering.db.mappers.OrderMapper;
import com.example.seckill_mybatis_reverse_engineering.db.po.Order;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class OrderDaolmpl implements OrderDao {
    @Resource
    private OrderMapper orderMapper;
    @Override
    public void insertOrder(Order order) {
        orderMapper.insert(order);
    }
    @Override
    public Order queryOrder(String orderNo) {
        return orderMapper.selectByOrderNo(orderNo);
    }
    @Override
    public void updateOrder(Order order) {
        orderMapper.updateByPrimaryKey(order);
    }
}
