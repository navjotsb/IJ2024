public class Student {
    int id;
    String name;

    Student()
    {
        System.out.println("default constructor");
    }

    Student(int id)
    {
    this.id=id;
    }
    Student(int id, String name)
    {
        this();
        this.id=id;
        this.name=name;
    }
    void printfile()
    {
        System.out.println(this.id);
        System.out.println(this.name);
    }

}
