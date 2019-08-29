package com.qa;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DBManager dbr = new DBManager();
        System.out.println("Connecting to database...");
        Connection conn = dbr.accessDB();
        Statement stmt = conn.createStatement();
        System.out.println("Creating statement...");
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you wanna do?");
        options();
        while(sc.hasNextInt()) {
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    dbr.c.createTable();
                    options();
                    break;
                case 2:
                    System.out.println("Enter SQL statement:");
                    String sq12 = sc.nextLine();
                    dbr.c.create(sq12);
                    options();
                    break;
                case 3:
                    System.out.println("Enter SQL statement:");
                    String sql3 = sc.nextLine();
                    ResultSet rs = dbr.r.read(sql3);
                    while(rs.next()){
                        int id  = rs.getInt("id");
                        String team = rs.getString("name");
                        String colour = rs.getString("colour");

                        //Display values
                        System.out.println("ID: " + id + " Team: " + team + " Colour: " + colour);
                    }
                    rs.close();
                    options();
                    break;
                case 4:
                    System.out.println("Enter SQL statement:");
                    String sql4 = sc.nextLine();
                    dbr.c.create(sql4);
                    options();
                    break;
                case 5:
                    System.out.println("Enter SQL statement");
                    String sql5 = sc.nextLine();
                    dbr.c.create(sql5);
                    options();
                    break;
                default:
                    System.out.println("See you soon");
                    break;
            }
        }


    }

    public static void options(){
        System.out.println("1: ADD TABLE");
        System.out.println("2: ADD RECORD");
        System.out.println("3: READ");
        System.out.println("4: UPDATE");
        System.out.println("5: DELETE");
        System.out.println("enter: FINISH");
    }
}