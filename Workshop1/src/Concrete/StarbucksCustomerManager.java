package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _personCheckService;

	public StarbucksCustomerManager(ICustomerCheckService iPersonCheckService) {
		_personCheckService = iPersonCheckService;
	}


	@Override
	public  void save(Customer customer) {
		if(_personCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db: "+customer.getFirstName());
		} else {
			System.out.println("Not a valid person!");
		}
		
	}

	
}
