package hw9.p1_p2_p3;

import Curs1.Teach1_1.Lek1_1.STUD1_1.adhw1_1;

public class RepositoryAddHomeWorks {
    public RepositoryAddHomeWorks(int i) {
    }

    public static void main(String[] args) {
        adhw1_1[] addhomeworks = new adhw1_1[10];
        addhomeworks[0] = new adhw1_1(01, "Start");
        addhomeworks[1] = new adhw1_1(02, "Begin");
        addhomeworks[2] = new adhw1_1(03, "Continue");

        for (int i = 0; i < addhomeworks.length; i++) {
            addhomeworks[i] = new adhw1_1(i, "Name" + i);
            i=(i*3)/2+1;
        }
    }
}
