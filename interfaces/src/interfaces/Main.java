package interfaces;

public class Main {

	public static void main(String[] args) {
		SmsLogger smsLogger = new SmsLogger();
		DatabaseLogger databaseLogger = new DatabaseLogger();
		Logger[] dataAndSmsLogging = {databaseLogger,smsLogger};
 		CustomerService customerService = new CustomerService(dataAndSmsLogging);
		Customer oguz = new Customer(309518,"Oguz","Kaan");
		customerService.add(oguz);
	}

}
