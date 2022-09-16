//Name: Yumi Go
//Student ID: R00195941
//Group: SDH2-A

public class TV extends Product {
	
	private String make;
	private String model;
	private String type;
	
	TV(String name, String description, int price, String make, String model, String type) {
		super(name, description, price);
		this.make = make;
		this.model = model;
		this.type = type;
		ProductDB.addToHashMap(this);
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		if (type.equalsIgnoreCase("led")) {
			return "LED";
		} else if (make.equalsIgnoreCase("lcd")) {
			return "LCD";
		} else {
			return null;
		}
	}

	public void setType(String type) {
		if (type.equalsIgnoreCase("led")) {
			this.type = "LED";
		} else if (make.equalsIgnoreCase("lcd")) {
			this.type = "LCD";
		} else {
			this.type = null;
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	String print() {
		return "Name: " + this.name + " / " + 
				"Description: " + this.getDescription() + " / " + "Price: " + this.getPrice() + " / " + 
				"Make: " + this.getMake() + " / " + "Model: " + this.getModel() + " / " + "Type: " + this.getType() + "\n";	
	}

}


