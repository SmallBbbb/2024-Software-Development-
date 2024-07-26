package com.petplatform.dao;

import com.petplatform.POJO.Stuff;
import com.petplatform.POJO.Task;
import com.petplatform.POJO.User;
import com.petplatform.mapper.TaskMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * TaskDao 类，用于管理 Task 相关的数据库操作。
 * 这是一个数据访问对象（DAO），它封装了所有与 Task 表相关的数据库操作。
 * 它通过 MyBatis 的 Mapper 接口（TaskMapper）来执行 SQL 语句。
 */
public class TaskDao {

    /**
     * 静态常量，用于存储 TaskMapper 的实例。
     * 这个实例在静态初始化块中被初始化，并在整个应用程序中保持唯一。
     */
    private static final TaskMapper taskMapper;

    /**
     * 静态初始化块，用于加载 MyBatis 配置文件，并初始化 taskMapper。
     * 这个过程在类被加载到 JVM 时自动执行一次。
     */
    static {
        String resource = "mybatis-config.xml"; // MyBatis 配置文件路径
        InputStream inputStream = null;
        try {
            // 使用 MyBatis 提供的 Resources 工具类加载配置文件
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            // 如果配置文件加载失败，则抛出运行时异常
            throw new RuntimeException("Failed to load MyBatis configuration file.", e);
        }
        // 使用 SqlSessionFactoryBuilder 构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 创建一个自动提交事务的 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 通过 SqlSession 获取 TaskMapper 的实例
        taskMapper = sqlSession.getMapper(TaskMapper.class);
    }

    /**
     * 查询所有 Task 列表。
     * @return 返回 Task 对象的列表。
     */
    public static List<Task> selectTasks() {
        return taskMapper.selectTasks();
    }

    /**
     * 通过 Task 对象的某个属性（通常是 ID 或其他唯一标识）查询 Task。
     * 注意：这里的实现可能有些误导，因为通常需要根据具体的 ID 或属性来查询，而不是传递整个 Task 对象。
     * @param task 传递的 Task 对象，但实际上可能只使用了其中的某个属性作为查询条件。
     * @return 返回匹配的 Task 对象，如果没有找到则返回 null 或空集合（取决于 Mapper 接口的实现）。
     */
    public static Task selectTaskByNumber(Task task) {
        return taskMapper.selectTaskByNumber(task);
    }

    /**
     * 通过 Stuff（队长）的编号查询该队长负责的所有 Task 列表。
     * @param stuff Stuff 对象，这里主要使用其编号属性作为查询条件。
     * @return 返回匹配的 Task 对象列表。
     */
    public static List<Task> selectTasksByCaptainNumber(Stuff stuff) {
        return taskMapper.selectTaskByCaptainNumber(stuff);
    }

    /**
     * 插入一个新的 Task 到数据库中。
     * @param task 要插入的 Task 对象。
     */
    public static void insertTask(Task task) {
        taskMapper.insertTask(task);
    }

    /**
     * 更新数据库中的 Task 记录。
     * @param task 包含更新信息的 Task 对象。
     */
    public static void updateTask(Task task) {
        taskMapper.updateTask(task);
    }

    /**
     * 从数据库中删除指定的 Task 记录。
     * @param task 要删除的 Task 对象，通常使用其 ID 或其他唯一标识作为删除条件。
     */
    public static void deleteTask(Task task) {
        taskMapper.deleteTask(task);
    }

    public static void deleteTaskByStuffIdNumber(Stuff stuff) {
        taskMapper.deleteTaskByStuffIdNumber(stuff);
    }
}
