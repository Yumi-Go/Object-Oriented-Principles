// Name: Yumi Go
// Student ID: R00195941
// Group: SDH2-A

import java.text.DecimalFormat;

public abstract class Product {

	private String productID;
	protected String name;
	private String description;
	private int price;
	public static int autoProductIDcounter = 1;

	Product (String name, String description, int price) {
		this.productID = generateProductID();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
		
	public String getProductID() {
		return productID;
	}
		
	public String generateProductID() {
		DecimalFormat df = new DecimalFormat("P00000");
		String convertFormat = df.format(autoProductIDcounter);
		productID = convertFormat;
		autoProductIDcounter++;
		return productID;
	}

	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	abstract String print();

}