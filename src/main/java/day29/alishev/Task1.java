package day29.alishev;

public class Task1 {
    public static void main(String[] args) {

        first();
        System.out.println();
        second();
        System.out.println();
        third();


    }

    static void first() {
        int i = 0;
        while (i < 10) {
            System.out.print("JAVA ");
            i++;
        }
    }

    static void second() {
        for (int i = 0; i < 10; i++) {
            System.out.print("JAVA ");
        }
    }

   static void third() {
        for (int i = 0; i < 10; i++) {
            System.out.println("JAVA");
        }

    }
}
