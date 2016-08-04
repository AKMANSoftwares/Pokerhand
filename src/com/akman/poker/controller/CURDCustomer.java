/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.controller;

import com.akman.poker.model.Customer;
import com.akman.poker.model.Time;
import com.akman.poker.utils.Javaconnect;
import com.akman.poker.utils.Membership;
import com.akman.poker.utils.Status;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class CURDCustomer {

    public static Boolean save(Customer cus) {
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            int CustomerID = 0;

            String sqlQuery = "INSERT INTO customer(Name,MemberCode,Gender,Address,PhoneNo,"
                    + "MobileNo,City,ZipCode,IsActive,Email,MembershipType, Status) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

            pst = conn.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);

            pst.setString(1, cus.getName());
            pst.setString(2, cus.getMemberCode());
            pst.setString(3, cus.getGender());
            pst.setString(4, cus.getAddress());
            pst.setString(5, cus.getPhoneNo());
            pst.setString(6, cus.getMobileNo());
            pst.setString(7, cus.getCity());
            pst.setString(8, cus.getZipCode());
            pst.setBoolean(9, cus.getIsActive());
            pst.setString(10, cus.getEmail());
            pst.setString(11, cus.getMembership().toString());
            pst.setString(12, Status.NotPaid.toString());

            pst.executeUpdate();

            rs = pst.getGeneratedKeys();

            if (rs.next()) {

                CustomerID = rs.getInt(1);
            }

            String sql = "INSERT INTO time (CustomerID) VALUES (?)";
            pst = conn.prepareStatement(sql);

            pst.setInt(1, CustomerID);

            pst.execute();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(CURDCustomer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }

    }

    public static void update(Customer cus) {
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {

            String sqlquery = "UPDATE customer SET Name = ?,Age = ?,Gender =?,Address =?,PhoneNo =?,"
                    + "MobileNo =?,City =?,ZipCode =?,IsActive =?,Email =?,Comments =?,MembershipType = ? WHERE CustomerID = " + cus.getCustomerID();
            pst = conn.prepareStatement(sqlquery);

            pst.setString(1, cus.getName());
            pst.setString(2, cus.getAge());
            pst.setString(3, cus.getGender());
            pst.setString(4, cus.getAddress());
            pst.setString(5, cus.getPhoneNo());
            pst.setString(6, cus.getMobileNo());
            pst.setString(7, cus.getCity());
            pst.setString(8, cus.getZipCode());
            pst.setBoolean(9, cus.getIsActive());
            pst.setString(10, cus.getEmail());
            pst.setString(11, cus.getComments());
            pst.setString(12, cus.getMembership().toString());

            pst.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CURDCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }
    }

    public static void delete(Customer cus) {
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {

            String Query = "DELETE FROM customer WHERE CustomerID = " + cus.getCustomerID();

            pst = conn.prepareStatement(Query);

            pst.execute();

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }
    }

    public static List<Time> select() {
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        DateFormat format = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS.SSS");

        List<Time> timelist = new ArrayList<>();
        try {

            String sql = "Select * from customer C inner join time T on C.CustomerID = T.CustomerID";

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                int CustomerID = rs.getInt("CustomerID");
                String Name = rs.getString("Name");
                String gender = rs.getString("Gender");
                String address = rs.getString("Address");
                String Phone = rs.getString("PhoneNo");
                String Mobile = rs.getString("MobileNo");
                String City = rs.getString("City");
                String Zipcode = rs.getString("ZipCode");
                Boolean isActive = rs.getBoolean("IsActive");
                String email = rs.getString("Email");
                String membershiptype = rs.getString("MembershipType");
                String status = rs.getString("Status");
                String Membercode = rs.getString("MemberCode");
                int timeID = rs.getInt("ID");
                String timein = rs.getString("TimeIn");
                String Playingtime = rs.getString("StartPlaying");
                String TimeOut = rs.getString("TimeOut");

                Time time = new Time(timeID, timein, Playingtime, TimeOut, CustomerID,
                        Membercode, Name, gender, address, Phone, Mobile, City, Zipcode,
                        isActive, email, Membership.valueOf(membershiptype), Status.valueOf(status));
                timelist.add(time);

            }

        } catch (SQLException ex) {
            Logger.getLogger(CURDCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }
        return timelist;
    }

    public static String getLastID(Enum membership) {
        Connection conn = Javaconnect.ConnecrDb();
        PreparedStatement pst = null;
        ResultSet rs = null;
        System.out.println(membership);

        String LastCode = null;

        try {

            String sql = "SELECT MAX(MemberCode) AS MemberCode FROM customer where MembershipType = '" + membership + "'";

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            if (rs.next()) {

                LastCode = rs.getString("MemberCode");

            }

        } catch (SQLException ex) {
            Logger.getLogger(CURDCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
            DbUtils.closeQuietly(conn);
        }

        return LastCode;

    }

}
