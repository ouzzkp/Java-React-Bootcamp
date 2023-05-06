package nLayerdDemo;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.business.concretes.ProductManager;
import nLayerdDemo.dataAccess.concretes.AbcProductDao;
import nLayerdDemo.dataAccess.concretes.HibernateProductDao;
import nLayerdDemo.entities.concretes.Product;
import nLayerdDemo.core.JLoggerManagerAdapter;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Sadece entitiy'ler new lenmeli bu kod şuanda smell kod. Spring IoC ile çözülecek.
		ProductService productService1 = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		ProductService productService2 = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());

		
		Product p1 = new Product(1,3,"Araba",10.0,10);
		Product p2 = new Product(2,2,"Araba",10.0,10);
		
		
		productService1.add(p1);
		productService2.add(p2);

	}

}
