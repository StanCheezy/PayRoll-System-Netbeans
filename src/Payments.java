
public class Payments {

//    private int empID;
    private String Fname;
    private String Mname;
    private String Lname;
    private String address;
    private int phnNumber;
    private String dep;
    private String NRC_num;
    
//    int empID,
    public Payments( String Fname, String Mname, String Lname, String NRC_num, String address, String dep, int phnNumber) {
//        this.empID = empID;
        this.Fname = Fname;
        this.Mname = Mname;
        this.Lname = Lname;
        this.NRC_num = NRC_num;
        this.address = address;
        this.dep = dep;
        this.phnNumber = phnNumber;

    }

//    public int getEmpID() {
//        return empID;
//    }

    public int getPhnNumber() {
        return phnNumber;
    }

    public String getNRC_num() {
        return NRC_num;
    }


    public String getDep() {
        return dep;
    }

    public String getFname() {
        return Fname;
    }

    public String getMname() {
        return Mname;
    }

    public String getLname() {
        return Lname;
    }

    public String getAddress() {
        return address;
    }

}
