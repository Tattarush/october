package day25.four;

public class Main {
    public static void main(String[] args) {

        System.out.println(summing(1,2,3,4,5,6,8));

    }

    static int summing(int... r) {
        int sum = 0;
        for (int i = 0; i < r.length; i++) {
            sum += r[i];

        }
        return sum;
    }

}
