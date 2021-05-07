package org.example.dao;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class EurToHufDAOImpl implements EurToHufDAO{

    private static String DB_CONNECT;
    private static final String GET_ERTEK = "SELECT ertek FROM EURTOHUF WHERE id = (SELECT MAX(id) FROM EURTOHUF);";

    public EurToHufDAOImpl() {
        try {
            Properties props = new Properties();
            props.load(getClass().getResourceAsStream("/application.properties"));
            DB_CONNECT = props.getProperty("db.url");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String change() {
        String ertek = "";

        try(Connection conn = DriverManager.getConnection(DB_CONNECT); PreparedStatement ps = conn.prepareStatement(GET_ERTEK)) {
            ResultSet set = ps.executeQuery();
            ertek = set.getString("ertek");
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ertek;
    }
}
