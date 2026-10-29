package day29.alishev;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введи значение а ");
            int a = scanner.nextInt();
            System.out.println("Введи значение b");
            int b = scanner.nextInt();

            fori(a, b);
            System.out.println();
            whilei(a, b);

        }
    }

    static void fori(int a, int b) {
        System.out.println("Значения диапазона которые делятся на 5 , но не делятся на 10:");
        for (int i = a + 1; i < b; i++) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.print(i + " ");
            }
        }
    }

    static void whilei(int a, int b) {
        int i = a + 1;
        System.out.println("Значения диапазона которые делятся на 5 , но не делятся на 10 через while:");

        while (i < b) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.print(i +" ");
            }
            i++;
        }
    }
}
