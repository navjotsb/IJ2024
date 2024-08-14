import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee =new Employee(1,"Nav","Singh",64785453, "Pragra", 120000.00);
        Employee employee1 =new Employee(2,"Ank","J",12356, "Apple", 110000.00);
        Employee employee2 =new Employee(3,"Bav","Singh",554236, "Microsoft", 100000.00);
        Employee employee3 =new Employee(4,"D","S",5545236, "AMD", 125000.00);
        Employee employee4 =new Employee(5,"P","P",554285, "Samsung", 130000.00);

        List<Employee> eplist = new ArrayList<>();

        eplist.add(employee);
        eplist.add(employee1);
        eplist.add(employee2);
        eplist.add(employee3);
        eplist.add(employee4);

        Stream<Employee> stprocess = eplist.stream();
        Stream<Employee> stprocess1 = eplist.stream();
        Stream<Employee> stprocess2 = eplist.stream();


        List<Employee> moreSal = stprocess.filter(x -> x.getSalary()>110000.00).collect(Collectors.toList());
        System.out.println(moreSal);

        List<String> fName = stprocess1.filter(x-> x.getSalary() < 125000.00).map(Employee::getFirstName).collect(Collectors.toList());
        System.out.println(fName);

       Map<Integer,String> maplist = stprocess2.filter(x -> x.getSalary()<115000.00).collect(Collectors.toMap(x -> x.getEmpId(), v-> v.getCompany()));
        System.out.println(maplist);

        // optional classes -- to avoid null pointer exception


z
    }
}

