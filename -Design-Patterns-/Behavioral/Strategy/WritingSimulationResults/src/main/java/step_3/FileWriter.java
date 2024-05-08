package step_3;

public class FileWriter implements Writer {
    private String path;

    public FileWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(String result) {
        System.out.println("Writing " + result + " to " + path);
    }
}
