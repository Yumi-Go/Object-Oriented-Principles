//Name: Yumi Go
//Student ID: R00195941
//Group: SDH2-A

import java.util.ArrayList;

public class Customer {

	private String customerName;
	private String customerAddress;
	static ArrayList<String> customerOrderList = new ArrayList<>();

	Customer(String customerName, String customerAddress) {
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


    public static void addToCustomerOrderList(String customerName, OrderDetails orderData) {
    	try {
	    	String addCustomerOrder = "Customer Name: " + customerName + "\n" + "Order Item: " + orderData.product + 
	    								"  => Quantity: " + orderData.getQuantity() + " item(s)\n\n"; // for check
	    	customerOrderList.add(addCustomerOrder);
    	} catch(IllegalArgumentException e) {
    		System.out.println("Argument is wrong.");
    	}
    }
    
    public static void removeFromCustomerOrderList(String customerName) {
    	for (int i = 0; i < customerOrderList.size(); i++) {
    		String element = customerOrderList.get(i);
    		if (element.contains(customerName)){
    			customerOrderList.remove(customerOrderList.get(i));
    		}
    	}
    }
            
	public static String getFromCustomerList(String productID) {
		String result = "";
    	for (int i = 0; i < customerOrderList.size(); i++) {
    		String element = customerOrderList.get(i);
    		if (element.contains(productID)){
    			result = element;
    			break;
    		}
    	}
    	return result;
	}
    
    
    public static void returnEntireCustomerOrderList() {
    	for (String element : customerOrderList) {
    		System.out.print(element);
    	}
    }

}
