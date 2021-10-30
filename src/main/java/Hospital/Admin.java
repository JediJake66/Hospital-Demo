package Hospital;

public abstract class Admin extends HospitalEmployee {

    private String department;

    public String getDepartment(){
        return department;
    }

    public Admin(String employeeNumber, String name, String department){
        super(employeeNumber, name);
        this.department=department;
    }
    public abstract int calculatePay();
}
