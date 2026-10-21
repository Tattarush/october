package day21.three;

public class Main {
    public static void main(String[] args) {

        Overload overload = new Overload();

        overload.loads();
        overload.loads(1);
        overload.loads(2, 3);
    }
}


class Overload {

    void loads() {
        System.out.println("Без параметров");
    }

    void loads(int x) {
        System.out.println("Один параметр - "+ x);
    }

    void loads(int x, int y) {
        System.out.println("Два параметра - "+x + " "+ y);
    }

}
