import Abstract.*;
import Concrete.*;
import Entities.*;

public class main {

	public static void main(String[] args) {
		CustomerCheckManager checkManager = new CustomerCheckManager();
		BaseCustomerManager starCustomerManager = new StarbucksCustomerManager(checkManager);
		BaseCustomerManager neroCustomerManager2 = new NeroCustomerManager();
		Customer oguz = new Customer(16,"Oguz Kaan","Pehlivan","30.10.2002","1201492");
		starCustomerManager.save(oguz);
	}

}
