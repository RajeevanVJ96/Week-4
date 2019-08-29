package com.qa;

import java.sql.*;
import java.util.Scanner;

public class DBManager {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://35.242.176.81/testDB?useSSL=false";;
    static Connection conn = null;
    static Statement stmt = null;

    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Create c = new Create();
        Read r = new Read();


        Class.forName(JDBC_DRIVER);

        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        System.out.println("Creating statement...");
        stmt = conn.createStatement();
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you wanna do?");
        System.out.println("1: ADD TABLE");
        System.out.println("2: ADD RECORD");
        System.out.println("3: READ");
        System.out.println("4: UPDATE");
        System.out.println("5: DELETE");
        System.out.println("enter: FINISH");
        while(sc.hasNextInt()) {
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter SQL statement:");
                    String sql = sc.nextLine();
                    c.create(sql);
                    break;
                case 2:
                    System.out.println("Enter SQL statement:");
                    String sq12 = sc.nextLine();
                    c.create(sq12);
                    break;
                case 3:
                    System.out.println("Enter SQL statement:");
                    String sql3 = sc.nextLine();
                    ResultSet rs = r.read(sql3);
                    while(rs.next()){
                        int id  = rs.getInt("id");
                        String team = rs.getString("name");
                        String colour = rs.getString("colour");

                        //Display values
                        System.out.println("ID: " + id + " Team: " + team + " Colour: " + colour);
                    }
                    rs.close();
                    break;
                case 4:
                    System.out.println("Enter SQL statement:");
                    String sql4 = sc.nextLine();
                    c.create(sql4);
                    break;
                case 5:
                    System.out.println("Enter SQL statement");
                    String sql5 = sc.nextLine();
                    c.create(sql5);
                    break;
                default:
                    break;
            }
        }

        String drop = "DROP TABLE teams";
        c.create(drop);

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


        stmt.close();
        conn.close();
    }

}
