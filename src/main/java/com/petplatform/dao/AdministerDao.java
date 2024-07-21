package com.petplatform.dao;

import com.petplatform.POJO.Administer;
import com.petplatform.mapper.AdministerMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class AdministerDao {
    private static final AdministerMapper administerMapper;
    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        administerMapper = sqlSession.getMapper(AdministerMapper.class);
    }

    public static Administer selectAdministerByUsername(Administer administer) {
        return administerMapper.selectAdministerByUsername(administer);
    }


}
