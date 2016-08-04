/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.model;


import java.awt.Image;
import java.util.Date;

/**
 *
 * @author BTACTC
 */
public class Employees {

    protected int EmployeeID;
    private String EmployeeNo;
    private String Name;
    private String WPhone;
    private String Mobile;
    private String Address;
    protected String Email;
    private String BloodGroup;
    protected String EmailPassword;
    private double BasicSalary;
    private Date DOB;
    private Date JoiningDate;
    private Image image;

    /**
     * This is the constructor to initialize the Email and Password of an
     * employee.
     *
     * @param EmployeeID
     * @param Email
     * @param Password
     */
    public Employees(int EmployeeID, String Email, String EmailPassword) {
        this.EmployeeID = EmployeeID;
        this.Email = Email;
        this.EmailPassword = EmailPassword;
    }

    public Employees() {
    }
    
    /**
     * 
     * @return 
     */

    @Override
    public String toString() {
        return Email;
    }

}