package Hospital;

public class Janitor extends Admin {
    private boolean isCleaning;

    public Janitor(String employeeNumber, String name, String department, boolean isCleaning) {
        super(employeeNumber, name, department);
        this.isCleaning = isCleaning;
    }
    @Override
    public int calculatePay(){
        return 35000;
    }
}
