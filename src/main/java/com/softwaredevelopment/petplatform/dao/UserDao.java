package com.softwaredevelopment.petplatform.dao;

import com.softwaredevelopment.petplatform.JDBCUtils;
import com.softwaredevelopment.petplatform.POJO.User;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.SQLException;

public class UserDao {
    private static final Connection conn;
    static {
        try {
            conn = JDBCUtils.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * user表的插入方法
     * @param user 用户对象
     */
    public static void insertUser(@NotNull User user)  {
        try {
            String sql = "insert into USER (ACCOUNT_NUMBER, USERNAME, PASSWORD, NICKNAME, NAME, PHONE_NUMBER," +
                    " SEX, ACCOUNT_STATE, VOLUNTEER_QUALIFICATION) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
            Object[] params = {user.getUsername(), user.getPassword(),
                    user.getNickname(), user.getName(), user.getPhoneNumber(), user.getSex(),
                    user.getAccountState(), user.getVolunteerQualification()};
            qr.update(conn, sql, params);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User " + user.getAccountNumber() + " inserted");
        DbUtils.closeQuietly(conn);
    }

    /**
     * user表的删除方法
     * @param user 用户对象
     */
    public static void deleteUser(@NotNull User user) {
        try {
            String sql = "delete from user where account_number = ?";
            QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
            qr.update(conn, sql, user.getAccountNumber());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User " + user.getAccountNumber() + " deleted");
        DbUtils.closeQuietly(conn);
    }

    /**
     *user表的更改方法
     * @param user 用户对象
     */
    public static void updateUser(@NotNull User user) {
        try {
            String sql = "update user set username = ?, password = ?, nickname = ?, " +
                    "name = ?, phone_number = ?, sex = ?,account_state = ?, " +
                    "volunteer_qualification = ? where account_number = ?";
            Object[] params = {user.getUsername(), user.getPassword(),
                    user.getNickname(), user.getName(), user.getPhoneNumber(), user.getSex(),
                    user.getAccountState(), user.getVolunteerQualification(), user.getAccountNumber()};
            QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
            qr.update(conn, sql, params);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("User " + user.getAccountNumber() + " updated");
        DbUtils.closeQuietly(conn);
    }

    /**
     * user表的查询方法
     * @param accountNumber
     */
    public static void getUserByAccountNumber(int accountNumber) {
        String sql = "select * from user where account_number = ?";
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        try {
            User u = qr.query(conn, sql, new BeanHandler<User>(User.class), accountNumber);
            System.out.println(u);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
