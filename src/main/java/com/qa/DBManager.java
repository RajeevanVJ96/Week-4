package com.qa;

import java.sql.*;

public class DBManager {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://35.242.176.81/testDB?useSSL=false";;
    static Connection conn = null;
    static Statement stmt = null;

    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName(JDBC_DRIVER);

        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL,USER,PASS);

        System.out.println("Creating statement...");
        stmt = conn.createStatement();
        String csql;
        String drop = "DROP TABLE teams";
        csql = "CREATE TABLE teams(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20) NOT NULL, colour VARCHAR(20) NOT NULL)";
        String insert1 = "INSERT teams(name, colour) VALUES('MUFC', 'red')";
        String insert2 = "INSERT teams(name, colour) VALUES('MCFC', 'blue')";
        String insert3 = "INSERT teams(name, colour) VALUES('Liverpool', 'red')";
        String insert4 = "INSERT teams(name, colour) VALUES('Spurs', 'white')";
        create(drop);
        create(csql);
        create(insert1);
        create(insert2);
        create(insert3);
        create(insert4);
        String usql;
        usql = "UPDATE teams SET colour = 'black' WHERE id = 4";
        create(usql);
        String dsql;
        dsql = "DELETE teams WHERE id = 2";
        String rsql;
        rsql = "SELECT * FROM teams";
        ResultSet rs = read(rsql);

        while(rs.next()){
            int id  = rs.getInt("id");
            String team = rs.getString("name");
            String colour = rs.getString("colour");

            //Display values
            System.out.println("ID: " + id + "\r\nTeam: " + team + "\r\nColour:" + colour);
        }

        rs.close();
        stmt.close();
        conn.close();
    }

    public static ResultSet read(String query) throws SQLException {
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = stmt.executeQuery(query);
        return rs;


    }
//
//
    public static void create(String sql) throws SQLException {
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

}
