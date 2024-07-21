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

// StuffDao类，用于处理与Stuff对象相关的数据库操作
public class StuffDao {

    // 定义一个静态常量stuffMapper，用于存储StuffMapper接口的实例
    // StuffMapper是一个MyBatis的Mapper接口，它定义了与Stuff对象相关的数据库操作方法
    private static final StuffMapper stuffMapper;

    // 静态初始化块，用于在类加载时初始化stuffMapper
    static {
        // 指定MyBatis配置文件的路径
        String resource = "mybatis-config.xml";
        // 声明一个InputStream变量，用于读取配置文件
        InputStream inputStream = null;
        try {
            // 使用MyBatis提供的Resources工具类加载配置文件
            inputStream = Resources.getResourceAsStream(resource);
            // 如果配置文件不存在或读取出错，将抛出IOException
        } catch (IOException e) {
            // 将IOException转换为RuntimeException抛出，以便上层代码能够捕获并处理
            // 注意：在实际应用中，可能希望更精细地处理异常，而不是简单地抛出RuntimeException
            throw new RuntimeException("无法加载MyBatis配置文件", e);
        }
        // 使用SqlSessionFactoryBuilder构建SqlSessionFactory实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 打开一个SqlSession，并设置自动提交为true
        // 注意：这里使用自动提交模式可能不是最佳实践，因为它可能不适用于需要事务管理的场景
        // 在实际应用中，通常会在需要时手动控制事务的提交和回滚
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 通过SqlSession获取StuffMapper的实例
        // 这里将SqlSession与StuffMapper绑定，但请注意，SqlSession的关闭并没有在这里显式进行
        // 理论上，SqlSession应该在每次数据库操作完成后关闭，但在这里它被静态持有，这可能导致资源泄露
        // 在实际应用中，应该避免在静态上下文中管理SqlSession的生命周期
        stuffMapper = sqlSession.getMapper(StuffMapper.class);
    }

    // 定义一个静态方法，用于查询所有Stuff对象
    public static List<Stuff> selectStuffs() {
        // 调用stuffMapper中的selectStuffs方法，并返回查询结果
        return stuffMapper.selectStuffs();
    }

    // 定义一个静态方法，根据Stuff的ID或编号查询Stuff对象
    // 注意：这里的方法设计可能不是最优的，因为它接受一个Stuff对象作为参数
    // 在实际应用中，更常见的做法是直接传递ID或编号作为参数
    public static Stuff selectByStuffIdNumber(Stuff stuff) {
        // 调用stuffMapper中的selectByStuffIdNumber方法，传入Stuff对象（这里假设该对象包含要查询的ID或编号）
        return stuffMapper.selectByStuffIdNumber(stuff);
    }

    // 定义一个静态方法，用于插入新的Stuff对象到数据库
    public static void insertStuff(Stuff stuff) {
        // 调用stuffMapper中的insertStuff方法，传入要插入的Stuff对象
        stuffMapper.insertStuff(stuff);
    }

    // 定义一个静态方法，用于更新已存在的Stuff对象
    public static void updateStuff(Stuff stuff) {
        // 调用stuffMapper中的updateStuff方法，传入要更新的Stuff对象
        stuffMapper.updateStuff(stuff);
    }

    // 定义一个静态方法，用于从数据库中删除Stuff对象
    public static void deleteStuff(Stuff stuff) {
        // 调用stuffMapper中的deleteStuff方法，传入要删除的Stuff对象
        // 类似于selectByStuffIdNumber，这里也可能存在设计上的改进空间
        stuffMapper.deleteStuff(stuff);
    }

    // 注意：由于stuffMapper是静态持有的，并且与SqlSession绑定，这可能导致资源泄露和并发问题
    // 在实际应用中，建议采用依赖注入（如Spring）来管理StuffMapper的实例，并确保SqlSession的正确关闭
}
