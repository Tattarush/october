package day24.two;

public class Main {
    public static void main(String[] args) {

        Prm prm1 = new Prm();
        Prm prm2 = new Prm(1);
        Prm prm3 = new Prm(2, 2);

    }
}


class Prm {

    int x;

    Prm() {
        x = 0;
        System.out.println("Конструктор без параметров");
    }

    Prm(int x) {
        this.x = x;
        System.out.println("Конструктор с 1 параметром " + this.x);
    }

    Prm(int x, int y) {
        this.x = x * y;
        System.out.println("Конструктор с 2 параметрами "+ this.x);
    }




}
