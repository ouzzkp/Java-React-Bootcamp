package inheritance2;
public class FileLogger extends Logger {
    // method overriding
    @Override
    public void log() {
        System.out.println("File yollandı");
    }

}