/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stan
 */
public class department {
    
    private String empID;
    private int phnNum;
    private String fname;
    private String mname;
    private String lname;
    private String add;
    

    public department(String empID, String fname, String mname, String lname, String add, int phnNum) {
        this.empID = empID;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.add = add;
        this.phnNum = phnNum;
    }

    public String getEmpID() {
        return empID;
    }

    public int getPhnNum() {
        return phnNum;
    }

    public String getFname() {
        return fname;
    }

    public String getMname() {
        return mname;
    }

    public String getLname() {
        return lname;
    }

    public String getAdd() {
        return add;
    }
    
    
    
}
