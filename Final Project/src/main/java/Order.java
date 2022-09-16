//Name: Yumi Go
//Student ID: R00195941
//Group: SDH2-A

import java.util.ArrayList;

public class Order {
	
    static ArrayList<String> orderDetailList = new ArrayList<String>();
    
	Order(OrderDetails orderDetailObj) {
		Order.addToOrderDetailList(orderDetailObj);
	}
    
    public static void addToOrderDetailList(OrderDetails orderDetailObj) {    	
    	String addOrderDetail = orderDetailObj.getProduct() + "  => " + orderDetailObj.getQuantity() + " item(s)\n\n"; // for check
    	orderDetailList.add(addOrderDetail);
    }

    public static void removeFromOrderDetailList(String productID) {
    	for (int i = 0; i < orderDetailList.size(); i++) {
    		String element = orderDetailList.get(i);
    		if (element.contains(productID)){
    			orderDetailList.remove(orderDetailList.get(i));
    		}
    	}
    }

	public static String findFromOrderDetailList(String productID) {
		String result = "";
    	for (int i = 0; i < orderDetailList.size(); i++) {
    		String element = orderDetailList.get(i);
    		if (element.contains(productID)){
    			result = element;
    			break;
    		}
    	}
		return result;
	}

    public static void returnEntireOrderDetailList() {
    	for (String element : orderDetailList) {
    		System.out.print(element);
    	}
    }
    
}
