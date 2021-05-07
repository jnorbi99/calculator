package org.example.dao;

import org.example.model.Tudomanyos;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class TudomanyosDAOImpl implements TudomaynosDAO{

    private static String DB_CONNECT;
    private static final String SAVE_MUVELET = "INSERT INTO TUDOMANYOS(muvelet) VALUES (?);";
    private static final String GET_MUVELET = "SELECT muvelet FROM TUDOMANYOS WHERE id = (SELECT MAX(id) FROM TUDOMANYOS);";
    private static final String DELETE_MUVELET = "DELETE FROM TUDOMANYOS;";

    public TudomanyosDAOImpl() {
        try {
            Properties props = new Properties();
            props.load(getClass().getResourceAsStream("/application.properties"));
            DB_CONNECT = props.getProperty("db.url");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Tudomanyos t) {
        try(Connection conn = DriverManager.getConnection(DB_CONNECT); PreparedStatement ps = conn.prepareStatement(SAVE_MUVELET)) {
            ps.setString(1, t.getTudomanyosMuvelet());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getElozo() {
        String elozo = "";

        try(Connection conn = DriverManager.getConnection(DB_CONNECT); PreparedStatement ps2 = conn.prepareStatement(GET_MUVELET)) {
            ResultSet set = ps2.executeQuery();
            while(set.next()) {
                elozo = set.getString("muvelet");
            }
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return elozo;
    }

    @Override
    public void deleteMemo() {
        try(Connection conn = DriverManager.getConnection(DB_CONNECT); PreparedStatement ps3 = conn.prepareStatement(DELETE_MUVELET)) {
            ps3.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
