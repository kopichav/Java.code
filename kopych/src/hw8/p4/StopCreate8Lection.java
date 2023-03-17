package hw8.p4;

import hw6.Lection;

public class StopCreate8Lection {
    public static void main(String[] args) {
        Lection lection1 = new Lection(1);
        for (int i = 0; i <= 8; i++) {
            if (i == 8)
                System.out.println(i);
            {
                break;
            }
        }
    }
}