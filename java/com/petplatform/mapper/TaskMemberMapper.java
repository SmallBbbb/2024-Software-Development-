package com.petplatform.mapper;

import com.petplatform.POJO.Task;
import com.petplatform.POJO.TaskMember;

import java.util.List;

public interface TaskMemberMapper {
    List<TaskMember> selectMemberByTaskNumber(Task task);
}
