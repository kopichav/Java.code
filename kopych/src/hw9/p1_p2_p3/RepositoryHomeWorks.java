package hw9.p1_p2_p3;

import Curs1.Teach1_1.Lek1_1.STUD1_1.hw1_1;

public class RepositoryHomeWorks {
    public RepositoryHomeWorks(int i) {
    }

    public static void main(String[] args) {
        hw1_1[] homeworks = new hw1_1[5];
        homeworks[0] = new hw1_1(01, "Start");
        homeworks[1] = new hw1_1(02, "Begin");
        homeworks[2] = new hw1_1(03, "Continue");

        for (int i = 0; i < homeworks.length; i++) {
            homeworks[i] = new hw1_1(i, "Name" + i);
            i=(i*3)/2+1;
        }
    }
}
