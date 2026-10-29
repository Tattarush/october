package day29.alishev;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введи число ");
            int x = scanner.nextInt();

            double y = check(x);
            System.out.println(y);
        }
    }

    static double check(int x) {

        if (x >= 5) {
            return (double) ((x * x) - 10) / (x + 7);
        } else if (x > -3 && x < 5) {
            return (double) (x + 3) * ((x * x) - 2);
        } else {
            return 420;
        }

    }
}
