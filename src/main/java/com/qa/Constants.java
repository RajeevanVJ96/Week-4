package com.qa;

import java.sql.Connection;
import java.sql.Statement;

public class Constants {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://35.242.176.81/testDB?useSSL=false";;
    static Connection conn = null;
    static Statement stmt = null;

    static final String USER = "root";
    static final String PASS = "";
}
