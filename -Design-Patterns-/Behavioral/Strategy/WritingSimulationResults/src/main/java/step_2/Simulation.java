package step_2;

import java.util.Random;

public class Simulation {

    void run() {
        Random random = new Random();
        double rand = random.nextDouble();
        ConsoleWriter writer = new ConsoleWriter();

        // Business logic
        String result = (rand <= 0.5) ? "Heads" : "Tails";

        writer.write(result);
    }
}
