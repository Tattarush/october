package day29.three;

public class Shape {
    private int dlina;
    private int shirina;


    public Shape(int dlina, int shirina) {
        this.dlina = dlina;
        this.shirina = shirina;
    }

    public Shape(int x) {
        dlina = shirina = x;
    }

    public int getDlina() {
        return dlina;
    }

    public void setDlina(int dlina) {
        this.dlina = dlina;
    }

    public int getShirina() {
        return shirina;
    }

    public void setShirina(int shirina) {
        this.shirina = shirina;
    }
}
