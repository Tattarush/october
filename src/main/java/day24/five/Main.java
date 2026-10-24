package day24.five;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(2);
        box.sum();

    }
}


class Box<T extends Number>{
    T x;
    Box(T x) {
        this.x = x;
    }

    void sum() {
        System.out.println(x.intValue() + x.intValue());
    }

}