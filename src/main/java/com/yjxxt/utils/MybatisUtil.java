package com.yjxxt.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MybatisUtil {
    private static SqlSessionFactory factory = null;
    static {
        try {
            factory = new SqlSessionFactoryBuilder().
                    build(Resources.getResourceAsStream("mybatis.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /* 返回一个会话 */
    public static SqlSession getSession() {
        SqlSession session =null;
        if(factory!=null) {
            //session = factory.openSession();//默认手动提交事务
            session = factory.openSession(true);//自动提交
        }
        return session;
    }
}
