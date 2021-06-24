package com.example.seckill_mybatis_reverse_engineering.db.dao;

import com.example.seckill_mybatis_reverse_engineering.db.po.Order;

public interface OrderDao {
    void insertOrder(Order order);
    Order queryOrder(String orderNo);
    void updateOrder(Order order);
}
