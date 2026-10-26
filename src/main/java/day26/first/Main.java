package day26.first;

public class Main {
    public static void main(String[] args) {

        Triangle tr = new Triangle("bla", 2.0, 3.0);

        System.out.println(tr.getWidth());
        System.out.println(tr.getHeight());

        Shape sh = new Shape();
        System.out.println(sh.getWidth());
        System.out.println(sh.getHeight());
    }
}


class Shape {

    private double width;
    private double height;

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


class Triangle extends Shape {
    private String s;

    Triangle(String s, double x, double y) {
        setWidth(x);
        setHeight(y);
        this.s = s;
    }

}