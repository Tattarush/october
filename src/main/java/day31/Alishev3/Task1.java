package day31.Alishev3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int countEven = 0;
        int countOdd = 0;
        int countLE = 0;
        int countOne = 0;
        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введи размер массива");
            String str;
            int size = 0;
            if ((str = reader.readLine()) != null) {
                size = Integer.parseInt(str);
            }

            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(10) + 1;
                sum += array[i];
            }

            for (int x : array) {
                System.out.print(x+" ");
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i] > 8) {
                    countLE++;
                }
                if (array[i] == 1) {
                    countOne++;
                }
                if (array[i] % 2 == 0) {
                    countEven++;
                }
                if (array[i] % 2 != 0) {
                    countOdd++;
                }
            }

            System.out.println("\nДлина массива - " + array.length);
            System.out.println("Количество чисел больше 8 - " + countLE);
            System.out.println("Количество чисел равных 1 - " + countOne);
            System.out.println("Количество четных - "+ countEven);
            System.out.println("Количество нечетных - " + countOdd);
            System.out.println("Сумма всех элементов - "+ sum);
        }


    }
}

