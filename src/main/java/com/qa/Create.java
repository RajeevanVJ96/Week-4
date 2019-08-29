package com.qa;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Create extends DBManager {

    Scanner sc = new Scanner(System.in);

    public void createTable(){
        String tablename = readInputNl("Enter table name:");
        HashMap<String, ArrayList<String>> fields = new HashMap<>();
        String field;
        System.out.println("Enter fields:");
        while(sc.hasNextLine()){
            field = sc.nextLine();
            String fieldType = readInputNl("Enter type:");
            ArrayList<String> cons = contstraints(fieldType);
            fields.put(field,cons);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE").append(tablename).append(("("));
        for ( String f:fields.keySet()){
            sb.append(f);
            for (String s : fields.get(f)){
                sb.append(s);
            }
            sb.append(',');
        }


        try {
            stmt.executeUpdate(sb.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<String> contstraints(String s) {
        ArrayList<String> cons = new ArrayList<>();
        cons.add(s);
        while(sc.hasNextLine()){
            if (cons.contains("INT")){
            repstuff();
            System.out.println("5: AUTO_INCREMENT");
            String choice = sc.nextLine();
            char[] choices = choice.toCharArray();
            for (char c: choices){
                switch(c){
                    case '1':
                        cons.add("PRIMARY KEY");
                        break;
                    case '2':
                        cons.add("FOREIGN KEY");
                        break;
                    case '3':
                        cons.add("UNIQUE");
                        break;
                    case '4':
                        cons.add("NOT NULL");
                        break;
                    case '5':
                        cons.add("AUTO_INCREMENT");
                        break;
                    default:
                        break;
                }
            }
        }else{
            System.out.println("Choose the number corresponding to the constraints you want:");
            System.out.println("1: PRIMARY KEY");
            System.out.println("2: FOREIGN KEY");
            System.out.println("3: UNIQUE");
            System.out.println("4: NOT NULL");
            String choice = sc.nextLine();
            char[] choices = choice.toCharArray();
            for (char c: choices){
                switch(c){
                    case '1':
                        cons.add("PRIMARY KEY");
                        break;
                    case '2':
                        cons.add("FOREIGN KEY");
                        break;
                    case '3':
                        cons.add("UNIQUE");
                        break;
                    case '4':
                        cons.add("NOT NULL");
                        break;
                    default:
                        break;
                }
            }
        }}

        return cons;

    }

    public void create(String sql) throws SQLException {
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }



   }

   public void repstuff() {
       System.out.println("Choose the number corresponding to the constraints you want:");
       System.out.println("1: PRIMARY KEY");
       System.out.println("2: FOREIGN KEY");
       System.out.println("3: UNIQUE");
       System.out.println("4: NOT NULL");

   }

    public String readInput(String message){
        System.out.print(message);
        return sc.nextLine();
    }

    public String readInputNl(String message){
        System.out.println(message);
        return sc.nextLine();
    }

}

