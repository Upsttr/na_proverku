package Attestation1;

import java.util.Random;

public class Sensor {
    private Random random;

    public Sensor() {
        this.random = new Random();
    }


    public int getHumidity() {
        return random.nextInt(101);
    }
}
