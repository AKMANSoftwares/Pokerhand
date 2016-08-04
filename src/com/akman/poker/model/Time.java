/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.model;

import java.util.Date;

/**
 *
 * @author AKL SOFT
 */
public class Time extends Customer {

    private int ID;
    private String TimeIN;
    private String StartPlaying;
    private String TimeOut;
    private double TimePlayed;

    public Time(int ID, String TimeIN, String StartPlaying, String TimeOut,int CustomerID, String MemberCode, String Name, String Gender, String Address, String PhoneNo, String MobileNo, String City, String ZipCode, boolean IsActive, String Email, Enum membership, Enum Status) {
        super(CustomerID, MemberCode, Name, Gender, Address, PhoneNo, MobileNo, City, ZipCode, IsActive, Email, membership, Status);
        this.ID = ID;
        this.TimeIN = TimeIN;
        this.StartPlaying = StartPlaying;
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

    public double getTimePlayed() {
        return TimePlayed;
    }

    public void setTimePlayed(double TimePlayed) {
        this.TimePlayed = TimePlayed;
    }

    /**
     * It will calculate the time Player played.
     * The start playing and stop playing time cannot be empty. 
     * 
     * @return true or false if the time is calculated. 
     */
    public Boolean CalulateTime() {

//        if (getStartPlaying() != null && getTimeOut() != null) {
//
//            long diff = getStartPlaying().getTime() - getTimeOut().getTime();
//
//            TimePlayed = diff / ((double)1000 * 60);
//
//            return true;
//        }
//
        return false;

    }
    
    public Boolean CalculteAmount(){
        
//        if(TimePlayed <= 60){
//            
//                        
//        } else if (TimePlayed > = ){
        
        return true;
    }

}
