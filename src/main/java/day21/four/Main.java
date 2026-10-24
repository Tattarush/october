package day21.four;

public class Main {
    public static void main(String[] args) {

        Overload overload = new Overload();

        int x = 10;
        double y = 5.0;
        byte v = 1;
        float b = 7;

        System.out.println();

        overload.over(x);
        overload.over(y);
        overload.over(v);
        overload.over(b);
    }
}

class Overload {
//FIXME - это тудушка
    /**
     * Это комментарий
    * */

    void over(int x) {
        System.out.println(x);
    }

    void over(double x) {
        System.out.println(x);
    }

}
