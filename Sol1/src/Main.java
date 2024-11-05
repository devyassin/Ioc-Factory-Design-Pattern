//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Employee employee=new Employee("yassine","Full stack Dev");

    EmployeeManager employeeManager=new EmployeeManager();
    employeeManager.changeEmployeeStatus(employee,"Software Engineer");
    employeeManager.changeEmployeeStatus(employee,"Tech Lead");
    }
}