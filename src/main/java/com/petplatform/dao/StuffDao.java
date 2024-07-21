package com.petplatform.dao;

import com.petplatform.POJO.Stuff;
import com.petplatform.mapper.StuffMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StuffDao {
    private static final StuffMapper stuffMapper;
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
        stuffMapper = sqlSession.getMapper(StuffMapper.class);
    }

    public static List<Stuff> selectStuffs() {
        return stuffMapper.selectStuffs();
    }
    public static Stuff selectByStuffIdNumber(Stuff stuff) {
        return stuffMapper.selectByStuffIdNumber(stuff);
    }
    public static void insertStuff(Stuff stuff) {
        stuffMapper.insertStuff(stuff);
    }
    public static void updateStuff(Stuff stuff) {
        stuffMapper.updateStuff(stuff);
    }
    public static void deleteStuff(Stuff stuff) {
        stuffMapper.deleteStuff(stuff);
    }
}
