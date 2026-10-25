package day25.first;

class StaticBlock {
    static double st;
    static double st2;

    static {
        System.out.println("Внутри статического блока");
        st = Math.sqrt(2.0);
        st2 = Math.sqrt(3.0);
    }
    StaticBlock(String msg) {
        System.out.println(msg);
    }
}
public class Main {
    public static void main(String[] args) {

        StaticBlock staticBlock = new StaticBlock("Внутри конструктора");

        System.out.println(StaticBlock.st);
        System.out.println(StaticBlock.st2);

    }
}
