package day30.Alishev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Task2 {
    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Введи делимое и делитель");
            String str;
            while ((str = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(str);

                if (!st.hasMoreTokens()) {
                    System.out.println("Ввод пуст!");
                    continue;
                }

                int a = Integer.parseInt(st.nextToken());
                if (!st.hasMoreTokens()) {
                    if (a == 0) {
                        break;
                    }
                    System.out.println("Введи второе число!");
                    System.out.println("Введи делимое и делитель");
                    continue;
                }

                int b = Integer.parseInt(st.nextToken());
                if (b == 0) {
                    System.out.println("На ноль делить нельзя\nПрограмма завершена");
                    break;
                }

                System.out.println("Результат - "+ (double) a / b);

                System.out.println("\nВведи делимое и делитель ");
            }
        }
    }
}
