package day29.two;

public class Main {
    public static void main(String[] args) {

        Truck semi = new Truck(2, 700, 7, 44000);
        Truck picup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Грузовик может перевезти " + semi.getCargocap());
        System.out.println("Для преодоления "+ dist + " миль грузовику надо "+ gallons);
    }
}
