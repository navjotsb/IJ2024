public class Employee {

    private Integer empId;

    private String firstName;

    private String lastName;

    private Integer phoneNum;

    private String company;

    private Double salary;

    public Employee(Integer empId, String firstName, String lastName, Integer phoneNum, String company, Double salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.company = company;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public String getCompany() {
        return company;
    }

    public Double getSalary() {
        return salary;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNum=" + phoneNum +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
