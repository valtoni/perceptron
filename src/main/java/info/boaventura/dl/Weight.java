package info.boaventura.dl;

import java.util.Random;

public class Weight {

    private double value;

    public Weight() {
        value = new Random().nextDouble();
    }

    public Signal calculate(Signal signal) {
        return new Signal(signal.getValue() * value);
    }

}
