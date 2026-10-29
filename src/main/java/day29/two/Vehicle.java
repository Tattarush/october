package day29.two;

public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

}
