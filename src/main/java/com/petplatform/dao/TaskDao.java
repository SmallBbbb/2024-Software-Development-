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

public class TaskDao {
    private static final TaskMapper taskMapper;
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
        taskMapper = sqlSession.getMapper(TaskMapper.class);
    }

    public static List<Task> selectTasks() {
        return taskMapper.selectTasks();
    }
    public static Task selectTaskByNumber(Task task) {
        return taskMapper.selectTaskByNumber(task);
    }
    public static List<Task> selectTasksByCaptainNumber(Stuff stuff) {
        return taskMapper.selectTaskByCaptainNumber(stuff);
    }
    public static void insertTask(Task task) {
        taskMapper.insertTask(task);
    }
    public static void updateTask(Task task) {
        taskMapper.updateTask(task);
    }
    public static void deleteTask(Task task) {
        taskMapper.deleteTask(task);
    }
}
