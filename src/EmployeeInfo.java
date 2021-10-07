
public class EmployeeInfo{

    private int  PhnNumber;
    private String empID,empMname, empFname, empLname, NRC_Number, address, position;

    public EmployeeInfo(String empID, String empFname, String empMname, String empLname,
            String NRC_Number, String address, int PhnNumber, String position) {

        this.empID = empID;
        this.empFname = empFname;
        this.empMname = empMname;
        this.empLname = empLname;
        this.NRC_Number = NRC_Number;
        this.address = address;
        this.PhnNumber = PhnNumber;
        this.position = position;
    }

    public String getId() {
        return empID;
    }

    public String getFirstName() {
        return empFname;
    }

    public String getMiddleName() {
        return empMname;
    }

    public String getLastName() {
        return empLname;
    }

    public String getNRCNumber() {
        return NRC_Number;
    }

    public String getAddress() {
        return address;
    }

    public int getPhnNumber() {
        return PhnNumber;
    }

    public String getPosition() {
        return position;
    }

}
