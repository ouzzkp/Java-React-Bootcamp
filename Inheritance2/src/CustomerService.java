import javax.xml.crypto.Data;

public class CustomerService {
    public void add() {
        // adding customer
        System.out.println("Müşteri eklendi");
        // If a working class is going to use another working class, no action is taken
        // from the last class.
        DatabaseLogger databaseLogger = new DatabaseLogger(); // bad example
        databaseLogger.log();
    }

    public void addGoodExample(Logger logger) { // we can give all logger types as a parameter, more useful
        System.out.println("Müşteri Eklendi");
        logger.log();
    }

}
