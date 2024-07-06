public class Student {

    private String name;
    private int rollNumber;
    private int age;
    private String course;
    private double[] grades;

    public Student(String name, int rollNumber, int age, String course, double[] grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.course = course;
        this.grades = grades;
    }


    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double[] getGrades() {
        return grades;
    }


    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    double calculateAverageGrade() {
        double avg=0;
        for (int i = 0; i < grades.length; i++) {
            avg = avg + grades[i];
        }
        avg = avg / grades.length;
        return avg;
    }

    void displayInfo()
    {
        System.out.println(" Student Name is " + name);
        System.out.println(" Student roll number is " + rollNumber);
        System.out.println("Student age is + " + age);
        System.out.println(" Student is enrolled in " + course);
        System.out.println(" Student Avg Grade is " + calculateAverageGrade());

    }








}
