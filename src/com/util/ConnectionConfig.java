package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfig {
    public static Connection getConnection(){
        Connection connection = null;

        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        connection = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=CJDate;integratedSecurity=true","STUDENT_007","AKQJ10");
        }
        catch(Exception e){e.printStackTrace();}
        return connection;
    }

}
