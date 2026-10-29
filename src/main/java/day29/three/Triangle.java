package day29.three;

public class Triangle extends Shape {
    private String stile;

    public Triangle(int dlina, int shirina, String stile) {
        super(dlina, shirina);
        this.stile = stile;
    }

    public Triangle(int x, String stile) {
        super(x);
        this.stile = stile;
    }

    public String getStile() {
        return stile;
    }

    public void setStile(String stile) {
        this.stile = stile;
    }
}
