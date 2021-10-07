/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stan
 */

//salary_ID
//        employee_ID
//                accountID
//                        allowance
//                                bonus
//                                        overtimePay
//                                                cashAdvance
//                                                        tax
//                                                            grossSalary
//                                                                    netSalary
public class demoClass {
    
    private String salary_ID;
    private String employee_ID;
    private String accountID;
    private double allowance;
    private double bonus;
    private double overtimePay;
    private double cashAdvance;
    private double tax;
    private double grossPay;
    private double netSalary;
    
    public demoClass(String salary_ID,String employee_ID,String accountID,double allowance,double bonus,double overtimePay,
            double cashAdvance,double tax,double grossPay,double netSalary)
    {
        this.salary_ID = salary_ID;
        this.employee_ID = employee_ID;
        this.accountID = accountID;
        this.allowance = allowance;
        this.bonus = bonus;
        this.overtimePay = overtimePay;
        this.cashAdvance = cashAdvance;
        this.tax = tax;
        this.overtimePay = grossPay;
        this.netSalary = netSalary;
    }

    public void setSalary_ID(String salary_ID) {
        this.salary_ID = salary_ID;
    }

    public void setEmployee_ID(String employee_ID) {
        this.employee_ID = employee_ID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    public void setCashAdvance(double cashAdvance) {
        this.cashAdvance = cashAdvance;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
    
    
    
}
