package lesson3;

public class Sedan2 extends Car {
    public Sedan2(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    public void light() {
        String getCarName = super.getName();
        System.out.println("車名: " + getCarName);
        System.out.println("新功能: 開燈");
    }
}
