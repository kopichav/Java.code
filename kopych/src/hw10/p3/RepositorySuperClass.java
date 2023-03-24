package hw10.p3;

import hw6.Lection;
import hw9.p1_p2_p3.*;

public class RepositorySuperClass {
    private static int Lection;
    private int RepositoryLections;

    public int getRepositoryLections() { return RepositoryLections;
    }
    public static void main(int[] args) {
        Lection[] lections = new Lection[6];
        lections[0] = new Lection(1);
        lections[1] = new Lection(2);
        lections[2] = new Lection(3);

        for (int i = 0; i < lections.length; i++) {
            Lection lections2 = new Lection(i);

         if (lections2.getLection == 3) {
              System.out.println(Lection);

             Lection[] lection = new Lection[5];
             lections[0] = new Lection(1);
             lections[1] = new Lection(2);
             lections[2] = new Lection(3);
             lections[3] = new Lection(4);
             lections[4] = new Lection(5);
         }
     }
    }
}