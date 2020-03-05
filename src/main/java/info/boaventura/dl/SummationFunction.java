package info.boaventura.dl;

public class SummationFunction implements SigmaFunction {

    @Override
    public double calculate(SignalSet signals, Weight[] weights) {
        SignalSet newSignals = new SignalSet(signals.weightCalculate(weights));
        return newSignals.sum();
    }

}
