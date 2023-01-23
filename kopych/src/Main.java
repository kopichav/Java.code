import hw6.Curse;
import hw6.Lection;

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
          Curse curse1 = new Curse(1, "Animal");
          Lection lection1 = new Lection(1, "Lection1 of Curse1");
          Lection lection2 = new Lection(2, "Lection2 of Curse1");
          Lection lection3 = new Lection(3, "Lection3 of Curse1");
          Lection lection4 = new Lection(4, "Lection4 of Curse1");
          Lection lection5 = new Lection(5, "Lection5 of Curse1");
          Lection lection6 = new Lection(6, "Lection6 of Curse1");
          int counter9 = Lection.counter;
          System.out.println(lection6.id);
          System.out.println("Lections in Curse1-Animal = " + counter9);
      }

}