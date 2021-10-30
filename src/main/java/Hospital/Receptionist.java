package Hospital;

public class Receptionist extends Admin {
    private boolean isOnPhone;

    public Receptionist(String employeeNumber, String name, String department, boolean isOnPhone ) {
        super(employeeNumber, name, department);
        this.isOnPhone = isOnPhone;
    }
    @Override
    public int calculatePay(){
        return 40000;
    }
}
