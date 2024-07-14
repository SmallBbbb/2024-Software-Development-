package com.softwaredevelopment.petplatform;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {
    public static void main(String[] argv) throws SQLException {
        //创建数据库连接池对象
        DataSource ds = new ComboPooledDataSource();
        Connection connection = ds.getConnection();
        System.out.println(connection);
    }
}

