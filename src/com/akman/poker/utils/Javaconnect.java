package com.akman.poker.utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

public class Javaconnect {

    Connection conn = null;

    // Function To Connect DataBase
    public static Connection ConnecrDb() {
        try {
            String dbName = "pokerhand.db";

            String userName = "musheer";

            String pssword = "root";

            Class.forName("org.sqlite.JDBC").newInstance();

//            Connection conn  = DriverManager.getConnection("jdbc:mysql://192.168.10.3/"+dbName+"?" +
//                                   "user="+userName+"&password="+pssword+"");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:pokerhand.sqlite");

            System.out.println("Connection Successful");

            return conn;

        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, "Database empty or not connected"
                    + " or " + e.getMessage() + "");

            return null;

        }
    }
}
