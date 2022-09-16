//Name: Yumi Go
//Student ID: R00195941
//Group: SDH2-A

public class OrderDetails {

	Object product;
	private int quantity;
	
	OrderDetails(Phone product, int quantity) {
		this.product = ProductDB.findFromHashMap(product.getProductID());
		this.quantity = quantity;
	}
	
	OrderDetails(TV product, int quantity) {
		this.product = ProductDB.findFromHashMap(product.getProductID());
		this.quantity = quantity;
	}
	
	public Object getProduct() {
		return this.product;
	}

	public void setProduct(String productID) {
		String findProduct = ProductDB.findFromHashMap(productID);
		this.product = findProduct;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}


