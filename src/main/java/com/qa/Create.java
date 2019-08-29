package com.qa;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Create extends DBManager {

    public void createTable(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table name:");
        String tablename = sc.nextLine();
        HashMap<String, ArrayList<String>> fields;
        System.out.println("Enter fields");
        while(sc.hasNextLine()){
            String field = sc.nextLine();
            contstraints();
        }


        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE").append(name)

        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private ArrayList<String> contstraints() {
        ArrayList<String> cons = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Type:");
        cons.add(sc.nextLine());
        if (cons.contains("INT")){
            System.out.println("Choose the constraints you want:");
            System.out.println("1: PRIMARY KEY");
            System.out.println("2: AUTO_INCREMENT");
            System.out.println("3: UNIQUE");
            System.out.println("4: NOT NULL");
            System.out.println("5: FOREIGN KEY");
            String choice = sc.nextLine();
            char[] choices = choice.toCharArray();
            for (char c: choices){
                switch(c){
                    case '1':
                        cons.add("PRIMARY KEY");
                        break;
                    case '2':
                        cons.add("AUTO_INCREMENT");
                        break;
                    case '3':
                        cons.add("UNIQUE");
                        break;
                    case '4':
                        cons.add("NOT NULL");
                        break;
                    case '5':
                        cons.add("FOREIGN KEY");
                }
            }
        }else{
            System.out.println("1: PRIMARY KEY");
            System.out.println("2: FOREIGN KEY");
            System.out.println("3: UNIQUE");
            System.out.println("4: NOT NULL");
        }

    }

    public void create(String sql) throws SQLException {
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }



   }

}

