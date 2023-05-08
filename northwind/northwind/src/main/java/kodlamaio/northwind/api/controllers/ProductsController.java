package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	// autowired otomatik newleme işlemi yapar. Örneğin;
	// Productservice lazım der ve bakar, kim productService'ı implemente etmiş
	// sonra ProductManager p = new productmanager yapar
	// sonra productmanager dao ya ihtiyaç duyar onu da newler
	@Autowired 
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public List<Product> getAll(){
		 return this.productService.getAll();
		}
	}
