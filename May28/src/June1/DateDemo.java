package June1;

public class DateDemo {
     int day = 1;
     int month = 06;
     int year = 2024;
    public  void printData()
    {
        System.out.println(day + " / " + month + " / " + year);
    }
    DateDemo()
    {
        day=1;
        month=06;
        year=2023;
        System.out.println(day + " / " + month + " / " + year);
    }
    /* constructor .... is special kind of method () it does not return any kind of value not even void
   constructor name is same as class name
    DateDemo() // constructor
    Void DateDemo() // method
    new DateDemo(); // in main function construtor , also a object but unassigned
    constructor helps to initialize your object (value to start with)


     */

}
