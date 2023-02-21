package hw9.p1_p2_p3;

import Curs1.Teach1_1.Lek1_1.teach1_1;

public class RepositiryTeachers {
    public RepositiryTeachers(int i) {
    }

    public static void main(String[] args) {
        teach1_1[] teachers = new teach1_1[6];
        teachers[0] = new teach1_1(01, "First");
        teachers[1] = new teach1_1(02, "Secomd");


        for (int i = 0; i < teachers.length; i++) {
            teachers[i] = new teach1_1(i, "Name" + i);
            i=(i*3)/2+1;
            }
    }

}