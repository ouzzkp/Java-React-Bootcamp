package inheritance2;
public class LogService {
    // you shouldn't use if block for codes that can be alternatives to each other.
    public void log(int logType) {

        // bad example
        if (logType == 1) {
            System.out.println("Veri tabanına loglandı");
        }
        if (logType == 2) {
            System.out.println("Dosyaya loglandı");
        }
        if (logType == 3) {
            System.out.println("Email e loglandı");
        }

    }

}

// Log types
// 1 - Database
// 2 - File
// 3 - Email