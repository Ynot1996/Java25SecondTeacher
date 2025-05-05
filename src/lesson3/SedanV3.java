package lesson3;

public class SedanV3 extends Car {
    public SedanV3(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void wiper() {
        System.out.println("新功能: 擦車(改良版)");
    }

    public void getMaxSpeed(int price) {
        System.out.println("加價成功，升級馬力");
        maxSpeed += price;
        System.out.println("Max Speed: " + maxSpeed);
    }
}
