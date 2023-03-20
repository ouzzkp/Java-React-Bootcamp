package interfaces;

public class Utils {
	// araç görevi geren sınıflarımı her zaman newlemek yerine statik bir hale
	// getiriyorum
	public static void RunLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
