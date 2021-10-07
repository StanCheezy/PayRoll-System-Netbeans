/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stan
 */
public class salary {

    private int slipID;
    private double balance;
    private String date, day, timeIn, timeOut;

    public salary(int slipID, String day, String date, String timeIn, String timeOut, double balance) {

        this.slipID = slipID;
        this.day = day;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.balance = balance;
    }

    public int getSlipId() {
        return slipID;
    }

    public String getDay() {
        return day;
    }

    public String getDate() {
        return date;
    }

    public String getTimeIn() {
        return timeIn;
    }
    
    public String getTimeOut() {
        return timeOut;
    }
    
    public double getBalance() {
        return balance;
    }
}
