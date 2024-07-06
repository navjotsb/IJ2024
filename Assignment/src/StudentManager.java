public class StudentManager {

    Student[] students;
    int studentCount;

    public StudentManager(int size) {
        students = new Student[size];
        studentCount = 0;
    }

    void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Capacity full for student Manager");
        }
    }

    void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo();
        }
    }

    Student findStudentByRollNumber(int rollNumber) {
        for (int i = 0; i < studentCount; i++) {

            if (students[i].getRollNumber() == rollNumber) {
                return students[i];
            }
        }
        return null;
    }

    public void removeStudentByRollNumber(int rollNumber) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRollNumber() == rollNumber) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null;
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    void displayTopStudent() {
        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }

        Student topStudent = students[0];
        for (int i = 1; i < studentCount; i++) {
            if (students[i].calculateAverageGrade() > topStudent.calculateAverageGrade()) {
                topStudent = students[i];
            }
            for (int j = 0; j < studentCount; j++) {
                if (students[j].calculateAverageGrade() == topStudent.calculateAverageGrade()) {
                    students[j].displayInfo();
                }

            }

            System.out.println("Top Student:");

        }
    }
}

