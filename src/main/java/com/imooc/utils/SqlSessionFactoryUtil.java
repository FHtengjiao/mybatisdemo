package com.imooc.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtil {

    private static final String RESOURCE = "mybatis-conf.xml";

    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();

    private static SqlSessionFactory factory;

    public static void initFactory(){
        try {
            InputStream is = Resources.getResourceAsStream(RESOURCE);
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getFactory() {
        return factory;
    }

    public static void close() {
        SqlSession session = threadLocal.get();
        if (session != null) {
            session.close();
            threadLocal.set(null);
        }
    }

}
