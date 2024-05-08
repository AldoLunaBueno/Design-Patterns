package step_3;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String result) {
        System.out.println(result);
    }
}
