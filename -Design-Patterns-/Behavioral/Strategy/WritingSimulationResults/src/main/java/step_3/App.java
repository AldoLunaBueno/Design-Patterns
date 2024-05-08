package step_3;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random1 = new Random();
        Writer writer1 = new ConsoleWriter();
        Simulation simulation1 = new Simulation(10, random1, writer1);

        simulation1.run();

        Random random2 = new Random();
        Writer writer2 = new FileWriter("my/file.txt");
        Simulation simulation2 = new Simulation(10, random2, writer2);

        simulation2.run();
    }
}