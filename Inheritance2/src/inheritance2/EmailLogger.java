package inheritance2;
public class EmailLogger extends Logger {
    // method overriding
    @Override
    public void log() {
        System.out.println("Email yollandı");
    }
}