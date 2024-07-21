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

public class TaskMemberDao {
    private static final TaskMemberMapper taskMemberMapper;
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
        taskMemberMapper = sqlSession.getMapper(TaskMemberMapper.class);
    }
    public static List<TaskMember> selectMemberByTaskNumber(Task task) {
        return taskMemberMapper.selectMemberByTaskNumber(task);
    }
}
