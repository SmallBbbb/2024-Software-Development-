package com.softwaredevelopment.petplatform.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtils {
    private static ComboPooledDataSource ds = new ComboPooledDataSource();
    public static DataSource getDataSource() {
        return ds;
    }
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
