package interfaces;
// we use implements key word when use interface
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("SMS loglandı : "+message);
	}

}
