package hw6;
import java.util.Scanner;
public class Curse {
    public int id;
    public static int counter = 1;

    public Curse(int id) {
        this.id = id;
        counter++;
    }
    public Curse(int id, String name) {
    }
    public Lection(int id, String name) {
    }
    public static void main(String[] args) {

        System.out.println("please input");
        Scanner scanner = new Scanner(System.in);

       while (scanner.hasNext()) {
            final String stringFromScanner = scanner.nextLine();
            Lection lection3 = new Lection(3);
            System.out.println(lection3);
        }

        final boolean b = scanner.hasNext();

        System.out.println(b);

}
