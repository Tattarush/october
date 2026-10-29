package day29.five;

public class Main {
    public static void main(String[] args) {

        A a = new A(1);
        B b = new B(2, 3);

        A f;

        f = b;

        System.out.println(f.i + " ");

        f = a;
        System.out.println(f.i );

        System.out.println(b.i + " " + b.x );
    }
}


class A {
    int i;

    public A(int i) {
        this.i = i;
    }
}

class B extends A {
    int x;

    public B(int i, int x) {
        super(i);
        this.x = x;
    }
}