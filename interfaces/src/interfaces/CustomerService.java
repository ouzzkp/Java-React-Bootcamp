package interfaces;

// operasyon sınıfı
// müşteri operasyonları yazılacak
public class CustomerService {
	// iki tip bağımlılık vardır
	// loosly - tightly copuled
	// bu sistemde loosly coupled yapılmalı
	// neye bağımlı isen onun private değişkenini oluştururusn
	private Logger[] loggers;

	// bu sayede parametre olarak girilen logger, yukarıdaki logger ile alınır ve
	// dosyada kulllanılır.
	public CustomerService(Logger[] logger) {
		this.loggers = logger;
	}

	public void add(Customer customer) {
		System.out.println("Sisteme müşteri eklendi: " + customer.getId());
		Utils.RunLoggers(loggers, customer.getFirstName());

	}

	public void delete(Customer customer) {
		System.out.println("Sistemden müşteri silindi: " + customer.getId());
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
}
