package com.petplatform.mapper;

import com.petplatform.POJO.Stuff;
import com.petplatform.POJO.Task;

import java.util.List;

public interface TaskMapper {
    List<Task> selectTasks();
    Task selectTaskByNumber(Task task);
    List<Task> selectTaskByCaptainNumber(Stuff stuff);
    void insertTask(Task task);
    void updateTask(Task task);
    void deleteTask(Task task);
    void deleteTaskByStuffIdNumber(Stuff stuff);
}
