package hw9.p1_p2_p3;

import hw6.Lection;

public class RepositoryLections {
    public RepositoryLections(int i, String s) {
    }

    public RepositoryLections(int i) {
    }

    public static void main(String[] args) {
        Lection[] lections = new Lection[6];
        lections[0] = new Lection(01, "Start");
        lections[1] = new Lection(02, "Begin");
        lections[2] = new Lection(03, "Continue");

        for (int i = 0; i < lections.length; i++) {
            lections[i] = new Lection(i, "Name" + i);
            i=(i*3)/2+1;
        }
    }
}
