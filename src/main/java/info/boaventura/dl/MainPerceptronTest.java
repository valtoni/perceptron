package info.boaventura.dl;

public class MainPerceptronTest {

    public static void main(String[] args) {
        SinglePerceptron singlePerceptron = new SinglePerceptron(1);
        System.out.println(singlePerceptron.process(new SignalSet(0)));
        System.out.println(singlePerceptron.process(new SignalSet(0)));
        System.out.println(singlePerceptron.process(new SignalSet(0)));
        System.out.println(singlePerceptron.process(new SignalSet(1)));
    }

}
