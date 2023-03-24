package hw8.p3;

import hw6.Curse;

public class CheckCorrect {
    public static void main(String[] args) {
        System.out.println("Enter key 1 for choose odd number");
        System.out.println("Enter key 2 for choose even number");
            int i =0;

            switch (i) {
                case 1:
                    System.out.println("Yor choose odd number");
                    break;
                case 2:
                    System.out.println("Yor choose even number");
                    break;
                case 3:
                    System.out.println("Yor choose odd number");
                    break;
                case 4:
                    System.out.println("Yor choose even number");
                    break;
                case 5:
                    System.out.println("Yor choose odd number");
                    break;
                default:
                    System.out.println("Incorrect symbol");
            }
            int number1 = 5;
            int number2 = 0;

            while (number2 < number1) {
                System.out.println(number2 + " true");
                number2++;
            }
        }
    }

