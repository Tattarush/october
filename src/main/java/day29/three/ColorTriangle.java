package day29.three;

public class ColorTriangle extends Triangle {
    private String color;

    public ColorTriangle(int dlina, int shirina, String stile, String color) {
        super(dlina, shirina, stile);
        this.color = color;
    }

    public ColorTriangle(int x, String stile, String color) {
        super(x, stile);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
