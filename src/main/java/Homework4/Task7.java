package Homework4;

public class Task7 {
    public static void main(String[] args) {

        Car car = new Car("Subaru");
        int speed = car.getCurrentSpeed();   // в задании тут почему-то String
        System.out.println(speed);  // тут 0

        car.speedUp(25);
        speed = car.getCurrentSpeed();
        System.out.println(speed);  // тут 25

        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // тут 15

        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // тут 5

        car.brake();
        speed = car.getCurrentSpeed();
        System.out.println(speed); // тут 0


    }
}
