package day30.Alishev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введи название города");
           String str;
            while ((str = reader.readLine()) != null) {
                if ("stop".equalsIgnoreCase(str)) {
                    break;
                }
                switch (str) {
                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                        System.out.println("Россия");
                        break;
                    case "Рим":
                    case "Милан":
                    case "Турин":
                        System.out.println("Италия");
                        break;
                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        System.out.println("Англия");
                        break;
                    case "Берлин":
                    case "Мюнхен":
                    case "Кёльн":
                        System.out.println("Германия");
                        break;
                    default:
                        System.out.println("Неизвестная страна");
                        break;
                }
            }
        }
    }
}
