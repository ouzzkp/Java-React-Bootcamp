package nLayerdDemo.business.concretes;

import java.util.List;
import nLayerdDemo.jLogger.JloggerManager;
import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.core.LoggerService;
import nLayerdDemo.dataAccess.abstracts.ProductDao;
import nLayerdDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("ID'si 1. Bu kategoride ürün kabul edilmiyor.");
			return;
		}
		this.productDao.add(product);
<<<<<<< HEAD
		this.loggerService.logToSystem("logger-test");
=======
<<<<<<< HEAD
		this.loggerService.logToSystem("logger-test");
=======
		this.loggerService.logToSystem("log-test");
>>>>>>> main
>>>>>>> main
	}

	@Override
	public List<Product> getAll() {
		return null;
	}


}
