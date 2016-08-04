/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.model;

import com.akman.poker.controller.CURDCustomer;
import com.akman.poker.utils.Functions;
import com.akman.poker.utils.Membership;

/**
 *
 * @author AKL SOFT
 */
public class Customer {

    private int CustomerID;
    private String MemberCode;
    private String Name;
    private String Age;
    private String Gender;
    private String Address;
    private String PhoneNo;
    private String MobileNo;
    private String City;
    private String ZipCode;
    private boolean IsActive;
    private String Email;
    private String Comments;
    protected Enum membership;
    protected Enum Status;

    /**
     *
     * @param CustomerID
     * @param MemberCode
     * @param Name
     * @param Gender
     * @param Address
     * @param PhoneNo
     * @param MobileNo
     * @param City
     * @param ZipCode
     * @param IsActive
     * @param Email
     * @param membership
     * @param Status
     */
    public Customer(int CustomerID, String MemberCode, String Name, String Gender,
            String Address, String PhoneNo, String MobileNo, String City,
            String ZipCode, boolean IsActive, String Email,
            Enum membership, Enum Status) {

        this.CustomerID = CustomerID;
        this.MemberCode = MemberCode;
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.PhoneNo = PhoneNo;
        this.MobileNo = MobileNo;
        this.City = City;
        this.ZipCode = ZipCode;
        this.IsActive = IsActive;
        this.Email = Email;
        this.membership = membership;
        this.Status = Status;
    }

    /**
     *
     * @return CustomerID
     */
    public int getCustomerID() {
        return CustomerID;
    }

    /**
     *
     * @param CustomerID
     */
    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     *
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *
     * @return Age
     */
    public String getAge() {
        return Age;
    }

    /**
     *
     * @param Age
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     *
     * @return Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     *
     * @param Gender
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     *
     * @return Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     *
     * @param Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     *
     * @return PhoneNo
     */
    public String getPhoneNo() {
        return PhoneNo;
    }

    /**
     *
     * @param PhoneNo
     */
    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    /**
     *
     * @return MobileNo
     */
    public String getMobileNo() {
        return MobileNo;
    }

    /**
     *
     * @param MobileNo
     */
    public void setMobileNo(String MobileNo) {
        this.MobileNo = MobileNo;
    }

    /**
     *
     * @return City
     */
    public String getCity() {
        return City;
    }

    /**
     *
     * @param City
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     *
     * @return ZipCode
     */
    public String getZipCode() {
        return ZipCode;
    }

    /**
     *
     * @param ZipCode
     */
    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    /**
     *
     * @return IsActive
     */
    public boolean getIsActive() {
        return IsActive;
    }

    /**
     *
     * @param IsActive
     */
    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }

    /**
     *
     * @return Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     *
     * @param Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     *
     * @return Comments
     */
    public String getComments() {
        return Comments;
    }

    /**
     *
     * @param Comments
     */
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    /**
     *
     * @return membership
     */
    public Enum getMembership() {
        return membership;
    }

    /**
     *
     * @param membership
     */
    public void setMembership(Enum membership) {
        this.membership = membership;
    }

    /**
     *
     * @return Status
     */
    public Enum getStatus() {
        return Status;
    }

    /**
     *
     * @param Status
     */
    public void setStatus(Enum Status) {
        this.Status = Status;
    }

    public String getMemberCode() {
        return MemberCode;
    }

    /**
     * This function will get the Last Code of the monthly and Yearly Member
     * only. It will the increment the code by one. The Format of Code is M -
     * Year - ID
     *
     * @param member Enum Member Only Monthly and Yearly.
     * @return Sting Member Code
     */
    public static String GenerateMemberCode(Enum member) {

        char Initial = 'M';

        if (member.equals(Membership.Year)) {
            Initial = 'Y';
        }

        Integer Year = Functions.getCurrentYear();

        String LastCode = CURDCustomer.getLastID(member);
        
        System.out.println("last code: "+LastCode);
        char ID = '1';

        if (LastCode != null) {
            ID = (char) (LastCode.charAt(7) + 1);
        }

        System.out.println("ID is :" + ID);

        String MemberShipCode = Initial + "-" + Year.toString() + "-" + ID;

        return MemberShipCode;
    }

}
