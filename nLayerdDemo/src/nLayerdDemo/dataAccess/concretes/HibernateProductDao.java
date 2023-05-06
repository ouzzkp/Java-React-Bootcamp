package nLayerdDemo.dataAccess.concretes;

import java.util.List;

import nLayerdDemo.dataAccess.abstracts.ProductDao;

import nLayerdDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile eklendi "+ product.getName());
	}
	@Override
	public void update(Product product) {
	}
	@Override
	public void delete(Product product) {
	}
	@Override
	public Product get(int id) {
		return null;
	}
	@Override
	public List<Product>[] getAll() {
		return null;
	}
}
