package com.qa;

import java.sql.*;
import java.util.Scanner;

public class DBManager extends Constants {

    Create c = new Create();
    Read r = new Read();

    public Connection accessDB() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(Constants.DB_URL,Constants.USER, Constants.PASS);
        System.out.println("Creating statement...");
        return conn;
    }

    public void closeDB() throws SQLException {
        stmt.close();
        conn.close();
    }





//        String csql;
//        csql = "CREATE TABLE teams(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20) NOT NULL, colour VARCHAR(20) NOT NULL)";
//        String insert1 = "INSERT teams(name, colour) VALUES('MUFC', 'red')";
//        String insert2 = "INSERT teams(name, colour) VALUES('MCFC', 'blue')";
//        String insert3 = "INSERT teams(name, colour) VALUES('Liverpool', 'red')";
//        String insert4 = "INSERT teams(name, colour) VALUES('Spurs', 'white')";
//        c.create(csql);
//        c.create(insert1);
//        c.create(insert2);
//        c.create(insert3);
//        c.create(insert4);
//        String usql;
//        usql = "UPDATE teams SET colour = 'black' WHERE id = 4";
//        c.create(usql);
//        String dsql;
//        dsql = "DELETE FROM teams WHERE id = 2";
//        c.create(dsql);
//        String rsql;
//        rsql = "SELECT * FROM teams";



}


