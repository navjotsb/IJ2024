public class StudentMain {
    public static void main(String[] args) {
        StudentManager manager  = new StudentManager(5);
        StudentManager manager1  = new StudentManager(3);

        Student student1 = new Student("Alice", 1, 20, "Math", new double[]{90, 85, 88});
        Student student2 = new Student("Bob", 2, 21, "Physics", new double[]{78, 82, 80});
        Student student3 = new Student("Charlie", 3, 19, "Chemistry", new double[]{92, 98, 94});
        Student student4 = new Student("Nav", 4, 22, "Bio", new double[]{98.99, 88.99, 80.99});
        Student student5 = new Student("AJ", 5, 18, "Punjabi", new double[]{82, 89, 84});

        Student student6 = new Student("TS", 6, 18, "Hindi", new double[]{100, 99, 100});
        Student student7 = new Student("SG", 7, 18, "English", new double[]{100, 99, 100});
        Student student8 = new Student("CC", 8, 21, "English", new double[]{100, 99, 100});




        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);
        manager.addStudent(student4);
        manager.addStudent(student5);

        manager1.addStudent(student6);
        manager1.addStudent(student7);
        manager1.addStudent(student8);
        manager1.displayTopStudent();


       // System.out.println("All Students:");
        // manager.displayAllStudents();



       /* System.out.println("Find Student by Roll Number 2:");
        Student foundStudent = manager.findStudentByRollNumber(2);
        if (foundStudent != null) {
            foundStudent.displayInfo();
        } else {
            System.out.println("Student not found.");
        } */

       /* System.out.println("Remove Student by Roll Number 4:");
        manager.removeStudentByRollNumber(3);
        manager.displayAllStudents();

       System.out.println("All Students:");
        manager.displayAllStudents(); */

        System.out.println("Display Top Student:");
        manager.displayTopStudent();


    }

    }

