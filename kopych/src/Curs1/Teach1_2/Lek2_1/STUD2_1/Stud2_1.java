package Curs1.Teach1_2.Lek2_1.STUD2_1;

public class Stud2_1 {
    public int id;
    public static int counter = 1;

    private Stud2_1(int id) {
        this.id = id;
        counter++;
    }
}
