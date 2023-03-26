import hw11.p1.Role;
import hw11.p3_p4.Lecture;
import hw6.Curse;
import hw6.Lection;
import hw9.p1_p2_p3.*;

import static hw11.p3_p4.Lecture.lecture;

public class Main {
      public static void main(String[] args) {
      /*  static teach1_2 teach1_2 = new teach1_2 ();
        int counter1 = adhw1_1.counter;
        int counter2 = hw1_1.counter;
        int counter3 = Stud1_1.counter;
        int counter4 = adhw1_2.counter;
        int counter5 = hw1_2.counter;
        int counter6 = Stud1_2.counter;
        int counter7 = teach1_1.counter;
        int counter8 = teach1_2.counter;
       System.out.println("Hello students!");
         System.out.println("Add. home work of 1 student = " + counter1);
         System.out.println("Home work of 1 student = " + counter2);
         System.out.println("How mach of student = " + (counter3 + counter6));
         System.out.println("Add. home work of 2 student = " + counter4);
         System.out.println("Home work of 2 student = " + counter5);
         System.out.println("How mach of teachers on Curse1= " + (counter7+counter8));
    }    */
 /*       Home work 6
          Curse curse1 = new Curse(1, "Animal");
          Lection lection1 = new Lection(1, "Lection1 of Curse1");
          Lection lection2 = new Lection(2, "Lection2 of Curse1");
          Lection lection3 = new Lection(3, "Lection3 of Curse1");
          Lection lection4 = new Lection(4, "Lection4 of Curse1");
          Lection lection5 = new Lection(5, "Lection5 of Curse1");
          Lection lection6 = new Lection(6, "Lection6 of Curse1");
          int counter9 = Lection.counter;
          System.out.println(lection6.id);
          System.out.println("Lections in Curse1-Animal = " + counter9); */

 //        Home work 7. Please see package hw7 class SwitchCase and hw6 class Curse
//         Home work 8. Please see package hw8
//         Home work 9. Please see package hw9 p1_p2_p3, p5.
//           p4:
/*            System.out.println("Press key 1 for create new Course3 and 3 lections for Course");
            int i = 0;
            switch (i) {
                  case 1:
                        Curse curse3 = new Curse(4, "Finish");
                        Lection lection1 = new Lection(3, "Lection1 of Curse4");
                        Lection lection2 = new Lection(4, "Lection2 of Curse4");
                        Lection lection3 = new Lection(5, "Lection3 of Curse4");
                        System.out.println("New Course and 3 Lections for Course 3 created");
                        break;
            }*/
 //         Home work 11. Please see package hw11 p1
 //            p2:
            Role student = Role.STUDENT;
            Role teacher = Role.TEACHER;
            lecture = new Lecture();
            //            p4:
            System.out.println("For all information include Lection put case 2");
            int i = 0;
            switch (i) {
                  case 2:
                        System.out.println("All for student:");
                        System.out.println(student);
                        System.out.println("All for teachers:");
                        System.out.println(teacher);
                        System.out.println("All for lecture:");
                        System.out.println(lecture);
            }
      }
}