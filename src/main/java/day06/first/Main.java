package day06.first;

public class Main {


    public static void main(String[] args) {

        AccessDemo ob = new AccessDemo();

        System.out.println(ob.getAlpha());
        ob.setAlpha(123);
        System.out.println(ob.getAlpha());

        System.out.println(ob.beta);

        System.out.println(ob.gamma);
    }
}

class AccessDemo {
    private int alpha = 1;
    public int beta = 2;
    int gamma = 3;



    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
}
