package com.qa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {

    Connection conn = null;
    Statement stmt = null;

        public ResultSet read(String query) throws SQLException {
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = stmt.executeQuery(query);
        return rs;


    }
}
