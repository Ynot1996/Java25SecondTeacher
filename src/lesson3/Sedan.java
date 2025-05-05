package lesson3;

public class Sedan extends Car {
    public Sedan(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    public void back() {
        String getCarName = super.getName();
        System.out.println("車名: " + getCarName);
        System.out.println("新功能: 後退");
    }
}
