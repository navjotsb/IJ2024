package July9;

import July6.Box;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee emp = new Employee(1, "Nav", "Singh", "xyz@gmail.com", "Chandigarh");
        Employee emp1 = new Employee(2, "AJ", "Jagga", "xyz123@gmail.com", "Amritsar");
        list.add(emp);
        list.add(emp1);
        //System.out.println(list);

        for (Employee employee : list) {
            if (employee.firstName.equals("AJ")) {
                System.out.println(employee.firstName);
            }
        }
        for (Employee employee : list) {
            if (employee.id == 1) {
                System.out.println(employee.lastName);
            }

        }
    }
}
