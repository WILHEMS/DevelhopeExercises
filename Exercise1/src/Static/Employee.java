package Static;

public class Employee {
    String name;
    String surname;
    String address;

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }
    public String getEmployeeDetails(){
        return name+" " + surname+" " + address;
    }
}
