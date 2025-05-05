package lesson3;

public class Car {
    private String name;
    protected int maxSpeed;

    public Car(String name, int maxSpeed) {
        this.setMaxSpeed(maxSpeed);
        this.name = name;
    }

    public Car() {
    }

    public void getMaxSpeed() {
        System.out.println("Max Speed: " + maxSpeed);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void wiper() {
        System.out.println("新功能: 擦車");
    }
}
