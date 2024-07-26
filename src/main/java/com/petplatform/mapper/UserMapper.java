package com.petplatform.mapper;

import com.petplatform.POJO.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUsers();
    User selectByUserIdNumber(String userIdNumber);
    List<User> selectVolunteers();
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    String selectPasswordByUserName(User user);
}
