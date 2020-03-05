package info.boaventura.dl;

public class SigmoidFunction implements StepFunction {

    @Override
    public double calculate(double value) {
        return 1/ (1 + Math.exp(-value));
    }

}
