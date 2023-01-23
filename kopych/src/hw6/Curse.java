package hw6;

public class Curse {
    public int id;
    public static int counter = 1;

    public Curse(int id) {
        this.id = id;
        counter++;
    }

    public Curse(int id, String name) {

    }
}
