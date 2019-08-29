package com.qa;

import java.sql.SQLException;

public class Create extends DBManager {

    public void create(String sql) throws SQLException {
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }



   }

}

