package info.boaventura.dl;

public class SinglePerceptron implements Perceptron {

    private SigmaFunction sigmaFunction = new SummationFunction();
    private StepFunction stepFunction = new SigmoidFunction();

    private void populateWeights(int inputs) {
        populateWeights(inputs);
    }

    public SinglePerceptron(int inputs) {
        weights = new Weight[inputs];
        for (int i = 0; i < inputs; i++) {
            weights[i] = new Weight();
        }
    }

    private Weight[] weights;

    public double process(SignalSet signals) {
        double prevalue = sigmaFunction.calculate(signals, weights);
        return stepFunction.calculate(prevalue);
    }

}
