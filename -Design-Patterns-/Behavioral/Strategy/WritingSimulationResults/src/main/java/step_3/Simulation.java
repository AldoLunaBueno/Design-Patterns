package step_3;

import java.util.Random;

public class Simulation {
    private int n;
    private Random random;
    private Writer writer;

    public Simulation(int n, Random random, Writer writer) {
        this.n = n;
        this.random = random;
        this.writer = writer;
    }

    void run() {
        for (int i = 0; i < n; i++) {
            double rand = random.nextDouble();
            String result = (rand <= 0.5) ? "Heads" : "Tails";
            writer.write(result);
        }
    }
}
