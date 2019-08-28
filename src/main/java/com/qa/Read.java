package com.qa;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Read extends DBManager {

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
