package step_1;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        double r = random.nextDouble();

        // Business logic
        if (r <= 0.5) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}