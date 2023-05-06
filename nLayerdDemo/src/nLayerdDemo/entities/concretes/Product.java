package nLayerdDemo.entities.concretes;

import nLayerdDemo.entities.abstracts.Entitiy;

public class Product implements Entitiy{
	
	private int id;
	private int categoryId;
	private String name;
	private double unitPrive;
	private int unitInStock;
	
	public Product() {
		
	}
	public Product(int id, int categoryId, String name, double unitPrive, int unitInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrive = unitPrive;
		this.unitInStock = unitInStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrive() {
		return unitPrive;
	}
	public void setUnitPrive(double unitPrive) {
		this.unitPrive = unitPrive;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
}
