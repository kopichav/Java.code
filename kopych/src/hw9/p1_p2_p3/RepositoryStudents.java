package hw9.p1_p2_p3;

import hw5.Student;

public class RepositoryStudents {
    public RepositoryStudents(int i) {
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(001, "Petro");
        students[1] = new Student(002, "Dmytro");
        students[2] = new Student(003, "Semen");

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i, "Name" + i);
            i=(i*3)/2+1;
        }
    }
}