package models;

public class Product {
	private String name;
	private String description;
	private double price;

	/**
	 * Constructor
	 * @param name
	 * @param price
	 */
	public Product(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}
	
	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
