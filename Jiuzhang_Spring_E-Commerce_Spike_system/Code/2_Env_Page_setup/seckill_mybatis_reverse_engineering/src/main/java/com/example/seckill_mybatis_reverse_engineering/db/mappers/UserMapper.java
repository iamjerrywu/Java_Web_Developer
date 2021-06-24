package com.example.seckill_mybatis_reverse_engineering.db.mappers;

import com.example.seckill_mybatis_reverse_engineering.db.po.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}