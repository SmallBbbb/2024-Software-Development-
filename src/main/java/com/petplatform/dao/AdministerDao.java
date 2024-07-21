package com.petplatform.dao;

import com.petplatform.POJO.Administer;
import com.petplatform.mapper.AdministerMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

// 定义了一个名为AdministerDao的类，用于管理Administer相关的数据库操作
public class AdministerDao {
    // 使用static final修饰，表示这是一个静态常量，用于存储AdministerMapper的实例
    // AdministerMapper是一个MyBatis的Mapper接口，用于定义数据库操作
    private static final AdministerMapper administerMapper;

    // 静态初始化块，用于在类加载时初始化administerMapper
    static {
        // 定义MyBatis配置文件的路径
        String resource = "mybatis-config.xml";
        // 用于读取配置文件的输入流
        InputStream inputStream = null;
        try {
            // 使用Resources工具类加载MyBatis配置文件
            inputStream = Resources.getResourceAsStream(resource);
            // 如果加载配置文件时发生IOException异常，则抛出RuntimeException
        } catch (IOException e) {
            // 将IOException包装为RuntimeException抛出，以便上层调用者可以捕获并处理
            throw new RuntimeException(e);
        }
        // 使用SqlSessionFactoryBuilder构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 打开一个SqlSession，并设置自动提交为true（意味着每个操作后都会自动提交事务）
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 通过SqlSession获取AdministerMapper的实例
        administerMapper = sqlSession.getMapper(AdministerMapper.class);
        // 注意：这里的SqlSession没有被关闭，因为administerMapper是静态的，且假设SqlSession在内部处理连接池
        // 在实际应用中，静态持有SqlSession或Mapper实例通常不是最佳实践，但这里为了示例保持简单
    }

    // 定义一个静态方法，用于通过用户名查询Administer信息
    // 注意：这里的实现可能存在问题，因为通常需要根据用户名作为参数，而不是Administer对象
    // 这里假设Administer对象中包含用户名信息，并且Mapper接口中有相应的方法
    public static Administer selectAdministerByUsername(Administer administer) {
        // 调用Mapper接口中的方法，传入Administer对象（假设该对象包含了用于查询的用户名）
        // 并返回查询结果
        return administerMapper.selectAdministerByUsername(administer);
    }
    // 注意：此类可能还需要其他方法来处理增删改查等数据库操作，但这里只展示了查询的一个示例
}