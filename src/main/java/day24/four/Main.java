package day24.four;

public class Main {
    public static void main(String[] args) {

        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();
        ob1.x = 10;
        ob2.x = 20;

        StaticDemo.y = 100;

        System.out.println(ob1.sum());
        System.out.println(ob2.sum());
    }
}


class StaticDemo {

    int x;
    static int y;

    int sum() {
        return x + y;
    }
}