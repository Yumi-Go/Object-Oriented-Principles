//Name: Yumi Go
//Student ID: R00195941
//Group: SDH2-A

public class Phone extends Product {

	private String make;
	private String model;
	private int storage;
	
	Phone(String name, String description, int price, String make, String model, int storage) {
		super(name, description, price);
		this.make = make;
		this.model = model;
		this.storage = storage;
		ProductDB.addToHashMap(this);		
	}


	public String getMake() {
		if (make.equalsIgnoreCase("apple")) {
			return "Apple";
		} else if (make.equalsIgnoreCase("samsung")) {
			return "Samsung";
		} else if (make.equalsIgnoreCase("nokia")) {
			return "Nokia";
		} else {
			return null;
		}
	}
	
	public void setMake(String make) {		
		if (make.equalsIgnoreCase("apple")) {
			this.make = "Apple";
		} else if (make.equalsIgnoreCase("samsung")) {
			this.make = "Samsung";
		} else if (make.equalsIgnoreCase("nokia")) {
			this.make = "Nokia";
		} else {
			this.make = null;
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getStorage() {
		return this.storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	@Override
	String print() {
		return "Name: " + this.name + " / " + "Description: " + this.getDescription() + " / " + 
				"Price: " + this.getPrice() + " / " + "Make: " + this.getMake() + " / " + 
				"Model: " + this.getModel() + " / " + "Storage: " + this.getStorage() + "\n";
	}

}
