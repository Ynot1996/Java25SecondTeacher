package lesson3;

public class Demo {
    public static void main(String[] args) {
        // MessagePrinter m1 = new MessagePrinter();
        // m1.printMessage("Good Morning");
        // m1.printMessage(1.2, 3.4);
        // m1.printMessgae(1, 2, "Hello");

        Car c1 = new Car("BMW", 200);
        c1.getMaxSpeed();
        c1.setMaxSpeed(300);

        Sedan s1 = new Sedan("Sedan", 150);

        s1.back();

        Sedan2 s2 = new Sedan2("Sedan2", 150);
        s2.light();
        s2.getMaxSpeed();
        s2.wiper();

        SedanV3 s3 = new SedanV3("SedanV3", 150);
        s3.wiper();
        s3.getMaxSpeed(1000);
    }
}
