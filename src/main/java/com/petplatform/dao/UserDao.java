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

/**
 * UserDao 类，用于封装与 User 相关的数据库操作。
 * 这是一个数据访问对象（DAO），它通过 MyBatis 的 Mapper 接口（UserMapper）来执行 SQL 语句，
 * 从而实现对 User 数据的增删改查操作。
 */
public class UserDao {

    /**
     * 静态常量，用于存储 UserMapper 的实例。
     * 这个实例在静态初始化块中被初始化，并在整个应用程序中保持唯一。
     * 注意：虽然这种方式在某些简单场景下可以工作，但在多线程环境中可能会引发问题，
     * 因为 SqlSession 和 Mapper 实例通常应该是请求范围（Request Scope）或会话范围（Session Scope）的。
     */
    private static final UserMapper userMapper;

    /**
     * 静态初始化块，用于加载 MyBatis 配置文件，并初始化 userMapper。
     * 这个过程在类被加载到 JVM 时自动执行一次。
     */
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

    /**
     * 查询所有用户。
     * @return 返回包含所有用户信息的 List 集合。
     */
    public static List<User> selectUsers() {
        return userMapper.selectUsers();
    }

    /**
     * 根据用户ID查询用户信息。
     * 注意：这里假设 UserMapper 中有一个名为 selectByUserIdNumber 的方法，但实际上根据命名惯例，
     * 可能应该是 selectByPrimaryKey 或其他更明确的名称。
     * @param id 用户ID
     * @return 返回与指定 ID 匹配的用户对象。
     */
    public static User selectUserById(String id) {
        return userMapper.selectByUserIdNumber(id);
    }

    /**
     * 查询志愿者用户列表。
     * 假设 UserMapper 中有一个专门用于查询志愿者的方法。
     * @return 返回包含志愿者用户信息的 List 集合。
     */
    public static List<User> selectVolunteers() {
        return userMapper.selectVolunteers();
    }

    /**
     * 插入一个新用户到数据库中。
     * @param user 用户对象，包含要插入的数据。
     */
    public static void insertUser(User user) {
        userMapper.insertUser(user);
    }

    /**
     * 更新用户信息。
     * @param user 用户对象，包含要更新的数据。
     */
    public static void updateUser(User user) {
        userMapper.updateUser(user);
    }

    /**
     * 根据用户信息删除用户。
     * 注意：这里假设 UserMapper 中有一个直接接受 User 对象作为参数的 delete 方法，
     * 但在实际中，更常见的做法是使用主键或唯一标识符来删除记录。
     * @param user 用户对象，通常只使用其主键或唯一标识符来定位要删除的记录。
     */
    public static void deleteUser(User user) {
        userMapper.deleteUser(user);
    }
}
