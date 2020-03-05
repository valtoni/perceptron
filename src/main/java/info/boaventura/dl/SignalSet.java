package info.boaventura.dl;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class SignalSet {

    private Set<Signal> signals;

    public SignalSet(Set<Signal> signals) {
        this.signals = signals;
    }

    public SignalSet(double... signals) {
        this.signals = Arrays.stream(signals)
                .mapToObj(Signal::new)
                .collect(Collectors.toSet());
    }

    public Set<Signal> weightCalculate(Weight[] weight) {
        AtomicInteger i = new AtomicInteger(0);
        return signals.stream()
                .map(signal -> weight[i.getAndIncrement()].calculate(signal))
                .collect(Collectors.toSet());
    }

    public double sum() {
        return signals.stream()
                .mapToDouble(Signal::getValue)
                .reduce(Double::sum)
                .orElse(0);
    }

}
