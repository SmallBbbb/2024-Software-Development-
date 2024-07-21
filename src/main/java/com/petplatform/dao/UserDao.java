package com.petplatform.dao;

import com.petplatform.POJO.User;
import com.petplatform.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDao {
    private static final UserMapper userMapper;
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
            userMapper = sqlSession.getMapper(UserMapper.class);
    }

    public static List<User> selectUsers() {
        return userMapper.selectUsers();
    }
    public static User selectUserById(String id) {
        return userMapper.selectByUserIdNumber(id);
    }
    public static List<User> selectVolunteers() {
        return userMapper.selectVolunteers();
    }
    public static void insertUser(User user) {
        userMapper.insertUser(user);
    }
    public static void updateUser(User user) {
        userMapper.updateUser(user);
    }
    public static void deleteUser(User user) {
        userMapper.deleteUser(user);
    }
}
