package day25.three;

public class Main {
    public static void main(String[] args) {

        test(1, 2, 3, 4, 5);
        test(1,2);
        test();


        test2("a", 12, 234);
    }

    static void test(int... x) {
        System.out.println("Количество аргументов - " + x.length);

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }


    static void test2(String msg, int... x) {

        System.out.println("Количество аргументов у test2 - " + x.length);

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
