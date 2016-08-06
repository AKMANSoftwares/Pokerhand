/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Seconds;

/**
 *
 * @author AKL SOFT
 */
public class Time extends Customer {

    private int ID;
    private String TimeIN = null;
    private String StartPlaying = null;
    private String TimeOut = null;
    private String TimePlayed = null;
    private long Minut;
    private int Amount = 8;

    public Time(int ID, String TimeIN, String StartPlaying, String TimeOut, int CustomerID,
            String MemberCode, String Name, String Gender, String Address, String PhoneNo,
            String MobileNo, String City, String ZipCode, boolean IsActive, String Email,
            Enum membership, Enum Status) {
        super(CustomerID, MemberCode, Name, Gender, Address,
                PhoneNo, MobileNo, City, ZipCode, IsActive, Email, membership, Status);

        this.ID = ID;
        this.TimeIN = TimeIN;
        this.StartPlaying = (StartPlaying == null) ? "" : StartPlaying ;
        this.TimeOut = TimeOut;
    }

    /**
     *
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @return TimeIN
     */
    public String getTimeIN() {
        return TimeIN;
    }

    /**
     *
     * @param TimeIN
     */
    public void setTimeIN(String TimeIN) {
        this.TimeIN = TimeIN;
    }

    /**
     *
     * @return StartPlaying
     */
    public String getStartPlaying() {
        return StartPlaying;
    }

    /**
     *
     * @param StartPlaying
     */
    public void setStartPlaying(String StartPlaying) {
        this.StartPlaying = StartPlaying;
    }

    /**
     *
     * @return TimeOut
     */
    public String getTimeOut() {
        return TimeOut;
    }

    /**
     *
     * @param TimeOut
     */
    public void setTimeOut(String TimeOut) {
        this.TimeOut = TimeOut;
    }

    @Override
    public String toString() {
        return "Time{" + "ID=" + ID + ", TimeIN=" + TimeIN + ", StartPlaying=" + StartPlaying + ", TimeOut=" + TimeOut + '}';
    }

    public String getTimePlayed() {
        return TimePlayed;
    }

    public void setTimePlayed(String TimePlayed) {
        this.TimePlayed = TimePlayed;
    }

    /**
     * It will calculate the time Player played. The start playing and stop
     * playing time cannot be empty.
     *
     * @return true or false if the time is calculated.
     */
    public Boolean CalulateTime() {

        SimpleDateFormat format = new SimpleDateFormat("MMM d, yyyy HH:mm:ss ");
        
        Minut = 0;

        if (getStartPlaying() != null && getTimeOut() != null) {

            Date d1 = null;
            Date d2 = null;

            try {
                d1 = format.parse(getStartPlaying());
                d2 = format.parse(getTimeOut());

                DateTime dt1 = new DateTime(d1);
                DateTime dt2 = new DateTime(d2);

                Integer days = Days.daysBetween(dt1, dt2).getDays();
                Integer hours = Hours.hoursBetween(dt1, dt2).getHours() % 24;
                Integer Min = Minutes.minutesBetween(dt1, dt2).getMinutes() % 60;
                Integer Sec = Seconds.secondsBetween(dt1, dt2).getSeconds() % 60;

                TimePlayed = hours.toString() + ":" + Min.toString() + ":" + Sec.toString();

                Minut = getDifference(format.parse(getStartPlaying()), format.parse(getTimeOut()), TimeUnit.MINUTES);

            } catch (Exception e) {
                e.printStackTrace();
            }

            return true;

        }

        return false;

    }

    public static long getDifference(Date a, Date b, TimeUnit units) {
        return units.convert(b.getTime() - a.getTime(), TimeUnit.MILLISECONDS);
    }

    /**
     * This function calculate the amount. 
     * 
     * @return 
     */
    public Integer CalculteAmount() {
        
        System.out.println("Minutes are:" + Minut);
        
        this.Amount = 8;
        
        if (Minut <= 60) {
          return Amount;  
        }

        for (int i = 60; i < Minut; i = i + 30) {
            Amount = Amount + 4;
        }
        
        return Amount;
        
    }

}
