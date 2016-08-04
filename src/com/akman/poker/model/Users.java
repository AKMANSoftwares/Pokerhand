/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AKMAN
 */
public class Users extends Employees {

    String Username;
    String Password;
    Enum EmployeeType;
    List<Customer> customer;

    public Users(int EmployeeID, String Username, String Password, Enum EmployeeType, String Email, String EmailPassword) {
        
        
        super(EmployeeID, Email, EmailPassword);
        
        this.Username = Username;
        this.Password = Password;
        this.EmployeeType = EmployeeType;
        
        customer  = new ArrayList<>();
    }

    public Users() {
        
    }
    /**
     *
     * @param customer
     * @return
     */
    public Boolean addCustomer(Customer customer) {
        if (customer != null && this.customer != null) {
            if (!this.customer.contains(customer)) {
                return this.customer.add(customer);
            }
        }
        return false;
    }

    /**
     * 
     * @param customer
     * @return 
     */
    public Boolean removeCustomer(Customer customer) {
        if (customer != null && this.customer != null) {
            if (this.customer.contains(customer)) {
                return this.customer.remove(customer);
            }
        }
        return false;
    }

    /**
     * 
     * @param emailServerSetup 
     */

    public Enum getEmployeeType() {
        return EmployeeType;
    }

    public void setEmployeeType(Enum EmployeeType) {
        this.EmployeeType = EmployeeType;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getEmailPassword() {
        return EmailPassword;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setEmailPassword(String EmailPassword) {
        this.EmailPassword = EmailPassword;
    }
    
    
    
    
    
    
    
}
