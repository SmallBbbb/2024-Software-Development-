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
        String resource = "mybatis-config.xml"; // MyBatis 配置文件路径
        InputStream inputStream = null;
        try {
            // 加载 MyBatis 配置文件
            inputStream = Resources.getResourceAsStream(resource);
            // 构建 SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            // 创建一个自动提交事务的 SqlSession
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            // 通过 SqlSession 获取 UserMapper 的实例
            userMapper = sqlSession.getMapper(UserMapper.class);
            // 注意：这里的 SqlSession 没有显式关闭，因为我们在静态初始化块中操作，
            // 并且期望在整个应用程序生命周期中保持 Mapper 的实例。
            // 然而，这种做法在多线程或复杂的应用程序中可能会导致问题。
        } catch (IOException e) {
            // 如果配置文件加载失败，则抛出运行时异常
            throw new RuntimeException("Failed to load MyBatis configuration file.", e);
        }
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

    public static String selectPasswordByUserName(User user) {
        return userMapper.selectPasswordByUserName(user);
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
