package com.imooc.listener;

import com.imooc.utils.SqlSessionFactoryUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitSqlSessionListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("初始化数据库连接.......");
        SqlSessionFactoryUtil.initFactory();
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("销毁数据库连接");
        SqlSessionFactoryUtil.close();
    }
}
