package Homework4;

public class Task7 {
    public static void main(String[] args) {

        Car car = new Car("Subaru");
        int speed = car.getCurrentSpeed();
        System.out.println(speed);

        car.speedUp(25);
        speed = car.getCurrentSpeed();
        System.out.println(speed);

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
