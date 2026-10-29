package day29.first;

public class Main {
    public static void main(String[] args) {

        B b = new B(1, 2);

        b.show();

    }
}


class A {
    int i;


}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;

    }

    void show() {
        System.out.println(i);
        System.out.println(super.i);
    }

}