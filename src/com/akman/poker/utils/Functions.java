/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akman.poker.utils;

import com.akman.poker.controller.CURDCustomer;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author AKL SOFT
 */
public class Functions {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static final Pattern VALID_CNIC
            = Pattern.compile("^[0-9+]{5}-[0-9+]{7}-[0-9]{1}$", Pattern.CASE_INSENSITIVE);

    /**
     * This function validate the email address.
     *
     * @param emailStr
     * @return true or false
     */
    public static boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    /**
     * This function validate the CNIC address.
     *
     * @param CNIC
     * @return true or false.
     */
    public static boolean validateCNIC(String CNIC) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(CNIC);
        return matcher.find();
    }

    /**
     * This Function will convert the Java utile date to SQL Date.
     *
     * @param date
     * @return
     */
    public static java.sql.Timestamp ConvertDateToSqlDate(java.util.Date date) {

        java.sql.Timestamp sqlDate = new java.sql.Timestamp(date.getTime());
        return sqlDate;
    }

    /**
     * This function will get the current date and give only the year from it.
     *
     * @return
     */
    public static int getCurrentYear() {
        Date date = new Date(); // your date
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);

        return year;
    }



}
