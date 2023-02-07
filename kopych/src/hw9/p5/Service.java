package hw9.p5;

import hw9.p1_p2_p3.*;

public class Service {
    public static void main(String[] args) {
        System.out.println("Press key 3 for print all objects");
        int i = 0;
        switch (i) {
            case 3:
                RepositoryStudents students = new RepositoryStudents(i);
                RepositoryLections lections = new RepositoryLections(i);
                RepositoryHomeWorks homeworks = new RepositoryHomeWorks(i);
                RepositoryCurses curses = new RepositoryCurses(i);
                RepositoryAddHomeWorks addhomeworks = new RepositoryAddHomeWorks(i);
                RepositiryTeachers teachers = new RepositiryTeachers(i);
                System.out.println("All Courses:");
                System.out.println(curses);
                System.out.println("All Lections:");
                System.out.println(lections);
                System.out.println("All Teachers:");
                System.out.println(teachers);
                System.out.println("All Students:");
                System.out.println(students);
                System.out.println("All Homewokrs:");
                System.out.println(homeworks);
                System.out.println("All Add.Homewokrs:");
                System.out.println(addhomeworks);

        }
    }
}
