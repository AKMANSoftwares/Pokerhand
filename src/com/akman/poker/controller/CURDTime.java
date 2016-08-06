/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.controller;

import com.akman.poker.model.Time;
import com.akman.poker.utils.Functions;
import com.akman.poker.utils.Javaconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author AKL SOFT
 */
public class CURDTime {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    public CURDTime() {
        conn = Javaconnect.ConnecrDb();
    }

    public static void Save(Time time) {
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {

            String sql = "INSERT INTO time (TimeIn, StartPlaying , TimeOut) VALUES(?,?,?)";
            pst = conn.prepareStatement(sql);

            pst.setString(1, time.getTimeIN());
            pst.setString(2, time.getStartPlaying());
            pst.setString(3, time.getTimeOut());

            pst.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CURDTime.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }

    }

    public static void save(int CustomerID, Connection conn) {
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String sql = "INSERT INTO time (CustomerID) VALUES (?)";
            pst = conn.prepareStatement(sql);

            pst.setInt(1, CustomerID);

            pst.execute();
        } catch (Exception e) {
            Logger.getLogger(CURDTime.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            DbUtils.closeQuietly(pst);

        }
    }

    public static void UpdateStartTime(Time time) {

        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {

            String sql = "UPDATE time SET StartPlaying = ? where ID = " + time.getID();
            pst = conn.prepareStatement(sql);

            pst.setString(1, time.getStartPlaying());

            pst.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CURDTime.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }
    }

    public static void Delete() {

    }

    public static List Select() {
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;

        List<Time> timelist = new ArrayList<>();

        try {

            String sql = "Select * from time";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("ID");
                Date timein = rs.getDate("TimeIn");
                Date Playingtime = rs.getDate("StartPlaying");
                Date Endtime = rs.getDate("TimeOut");

//                Time time = new Time(id,timein,Playingtime,Endtime);
//                timelist.add(time);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CURDTime.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }

        return timelist;
    }

}
