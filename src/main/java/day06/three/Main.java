package day06.three;

public class Main {
    public static void main(String[] args) {

        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);


        System.out.println(ob1.sameBlock(ob2));
        System.out.println(ob1.sameBlock(ob3));
        System.out.println("---------------------");
        System.out.println(ob1.sameVolume(ob2));
        System.out.println(ob1.sameVolume(ob3));

    }
}


class Block {
    int a, b, c;
    int volume;

    Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        volume = a * b * c;
    }

    boolean sameBlock(Block ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    boolean sameVolume(Block ob) {
        if(ob.volume == volume) return true;
        else return false;
    }

}
