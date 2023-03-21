package Entities;

public class Game {
	
	private int id;
	private String gameName;
	private int gamePrice;
	private double discount;
	private String gameDescription;
	private int unitInStock;
	public Game(int id, String gameName, int gamePrice, double discount, String gameDescription, int unitInStock) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.discount = discount;
		this.gameDescription = gameDescription;
		this.unitInStock = unitInStock;
	}
	public Game() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getGameDescription() {
		return gameDescription;
	}
	public void setGameDescription(String gameDescription) {
		this.gameDescription = gameDescription;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	}
