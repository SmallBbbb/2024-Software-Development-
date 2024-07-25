package com.petplatform.dao;

import com.petplatform.POJO.Task;
import com.petplatform.POJO.TaskMember;
import com.petplatform.mapper.AdministerMapper;
import com.petplatform.mapper.TaskMemberMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * TaskMemberDao 类，用于管理 TaskMember 相关的数据库操作。
 * 这是一个数据访问对象（DAO），封装了所有与 TaskMember 表相关的数据库操作。
 * 它通过 MyBatis 的 Mapper 接口（TaskMemberMapper）来执行 SQL 语句。
 */
public class TaskMemberDao {

    /**
     * 静态常量，用于存储 TaskMemberMapper 的实例。
     * 这个实例在静态初始化块中被初始化，并在整个应用程序中保持唯一。
     * 注意：这种方式在多线程环境下虽然可以工作，但通常不推荐将 SqlSession 或 Mapper 实例保持为静态，
     * 因为这可能会导致事务管理和资源释放的问题。在实际应用中，应考虑使用依赖注入等方式来管理这些资源。
     */
    private static final TaskMemberMapper taskMemberMapper;

    /**
     * 静态初始化块，用于加载 MyBatis 配置文件，并初始化 taskMemberMapper。
     * 这个过程在类被加载到 JVM 时自动执行一次。
     */
    static {
        String resource = "mybatis-config.xml"; // MyBatis 配置文件路径
        InputStream inputStream = null;
        try {
            // 使用 MyBatis 提供的 Resources 工具类加载配置文件
            inputStream = Resources.getResourceAsStream(resource);
            // 构建 SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            // 创建一个自动提交事务的 SqlSession
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            // 通过 SqlSession 获取 TaskMemberMapper 的实例
            taskMemberMapper = sqlSession.getMapper(TaskMemberMapper.class);
            // 注意：这里的 SqlSession 没有显式关闭，因为我们在静态初始化块中操作，并且通常期望在整个应用程序生命周期中保持 Mapper 的实例。
            // 然而，这种做法在复杂的应用程序中可能会导致资源泄露或其他问题。
        } catch (IOException e) {
            // 如果配置文件加载失败，则抛出运行时异常
            throw new RuntimeException("Failed to load MyBatis configuration file.", e);
        }
    }

    /**
     * 通过 Task 的编号（或其他唯一标识）查询与该 Task 关联的所有 TaskMember 列表。
     * 注意：尽管方法名为 selectMemberByTaskNumber，但实际上它接受的是 Task 对象，这可能意味着
     * Mapper 接口中的方法可能使用了 Task 对象的某个属性（如编号）作为查询条件。
     * @param task Task 对象，通常只使用其编号或其他唯一标识符属性。
     * @return 返回与该 Task 关联的 TaskMember 对象列表。
     */
    public static List<TaskMember> selectMemberByTaskNumber(Task task) {
        return taskMemberMapper.selectMemberByTaskNumber(task);
        // 注意：这里的命名和实现可能需要根据实际的 Mapper 接口和数据库设计进行调整。
    }
}
