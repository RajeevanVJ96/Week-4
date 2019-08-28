package com.qa;





import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {

    Connection conn = null;
    Statement st = null;

    public ResultSet read(String query) throws SQLException {
        try {
            st = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = st.executeQuery(query);
        return rs;


    }


    public void create(String sql) throws SQLException {
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    public void update(String sql) throws SQLException {
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    public void delete(String sql) throws SQLException {
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
