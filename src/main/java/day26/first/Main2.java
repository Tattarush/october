package day26.first;

public class Main2 {
    public static void main(String[] args) {

        Triangle tr = new Triangle("bla", 2.0, 3.0);

        System.out.println(tr.getWidth());
        System.out.println(tr.getHeight());

        Shape2 sh = new Shape2(tr.getWidth(), tr.getHeight());
        System.out.println(sh.getWidth());
        System.out.println(sh.getHeight());
    }
}


class Shape2 {

    private double width;
    private double height;


    public Shape2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}


class Triangle2 extends Shape2 {
    private String s;

    Triangle2(String s, double x, double y) {
        super(x, y);
        this.s = s;
    }

}