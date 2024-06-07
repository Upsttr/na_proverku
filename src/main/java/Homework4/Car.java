package Homework4;

public class Car {
    String name;
    int currentSpeed = 0;

    public Car(String name) {
        this.name = name;
        this.currentSpeed = 0;

    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp(int speedIncrease) {
        currentSpeed = currentSpeed + speedIncrease;
    }

    public void brake() {
        if (currentSpeed <= 10) {
            currentSpeed = 0;
        } else {
            currentSpeed = currentSpeed - 10;
        }
    }
}
