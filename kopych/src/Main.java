import Curs1.Teach1_1.Lek1_1.STUD1_1.Stud1_1;
import Curs1.Teach1_1.Lek1_1.STUD1_1.adhw1_1;
import Curs1.Teach1_1.Lek1_1.STUD1_1.hw1_1;
import Curs1.Teach1_1.Lek1_1.STUD1_2.Stud1_2;
import Curs1.Teach1_1.Lek1_1.STUD1_2.adhw1_2;
import Curs1.Teach1_1.Lek1_1.STUD1_2.hw1_2;
import Curs1.Teach1_1.Lek1_1.teach1_1;
import Curs1.Teach1_2.Lek2_1.teach1_2;

public class Main {
     public static void main(String[] args) {
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
    }
}