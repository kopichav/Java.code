package hw8.p2;

import java.util.Scanner;

public class StopConsol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int genre = 0;

               System.out.println("Enter key 1 for stop Concol");
               genre = scanner.nextInt();

        while (true) {
            int i = 0;
            System.out.println(i);
            i++;


            switch (genre) {
                case 1:
                    System.out.println("Exit");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter correct key");

            }
        }
    }
}




