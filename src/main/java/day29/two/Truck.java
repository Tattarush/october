package day29.two;

public class Truck extends Vehicle {
    private int cargocap;

    public Truck(int p, int f, int m, int cargocap) {
        super(p, f, m);
        this.cargocap = cargocap;
    }

    public int getCargocap() {
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }
}
