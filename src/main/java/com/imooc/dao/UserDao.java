package com.imooc.dao;

import com.imooc.entity.User;
import com.imooc.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao {
    private SqlSession session = SqlSessionFactoryUtil.getFactory().openSession();

    public List<User> findAll() {
        return null;
    }
}
