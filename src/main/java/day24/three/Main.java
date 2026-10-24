package day24.three;

public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(9));

    }

    static long factorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
