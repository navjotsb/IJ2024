public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee();
        HRManager hrManager = new HRManager();

        employee.getSalary();
        employee.work();
        hrManager.addEmployee();
        hrManager.work();
    }
}
