package com.imooc.dao;

import com.imooc.entity.User;
import com.imooc.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao {
    private SqlSession session;
    private List<User> list;
    private User user;

    public List<User> findAll() {
        session = SqlSessionFactoryUtil.getFactory().openSession();
        try {
            list = session.selectList("findUsers");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }

    public User findById(Integer id) {
        session = SqlSessionFactoryUtil.getFactory().openSession();
        try {
            user = session.selectOne("findUsers", new User(id));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return user;
    }
}
