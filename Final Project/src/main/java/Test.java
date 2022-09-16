//Name: Yumi Go
//Student ID: R00195941
//Group: SDH2-A

public class Test {

	public static void main(String[] args) {

		try {
			
			//1. Create an empty object of ProductDB.
			ProductDB productDBobject = new ProductDB();
	
			//2. Create 4 phone objects (p1, p2, p3, p4) with your desired data.
			Phone P1 = new Phone("First Phone", "This is a First Phone.", 100, "Samsung", "galaxy20", 1000);
			Phone P2 = new Phone("Second Phone", "This is a Second Phone.", 200, "APPLE", "iPhone6", 2000);
			Phone P3 = new Phone("Third Phone", "This is a Third Phone.", 200, "Nokia", "X20", 2000);
			Phone P4 = new Phone("Fourth Phone", "This is a Fourth Phone.", 150, "Apple", "iPhone7", 2500);
	
			// (Every time a new object of Phone is created, it needs to be added automatically in the ProductDB)
//			ProductDB.returnWholeProducts(); // for test

			
			//3. Create 3 TV objects (T1, T2, T3) with your desired data.
			TV T1 = new TV("First TV", "This is a First TV.", 10000, "LG", "43UN73006LC", "LED");
			TV T2 = new TV("Second TV", "This is a Second TV.", 20000, "Sony", "Q80A", "LED");
			TV T3 = new TV("Third TV", "This is a Third TV.", 30000, "Samsung", "Q60A", "LED");
			
			// (Every time a new object of TV is created, it needs to be added automatically in the ProductDB)
//			ProductDB.returnWholeProducts(); // for test
			
			
			//4. Create 3 OrderDetails as follows
				//a. 5 phones (P2)
				//b. 2 TVs (T1)
				//c. 1 TV (T3)
			OrderDetails orderDetail_P2 = new OrderDetails(P2, 5);
			OrderDetails orderDetail_T1 = new OrderDetails(T1, 2);
			OrderDetails orderDetail_T3 = new OrderDetails(T3, 1);
//			System.out.println(orderDetail_P2.product); // for test
//			System.out.println(orderDetail_T1.product); // for test
//			System.out.println(orderDetail_T3.product); // for test
	
			
			//5. Create an Order that contains the above OrderDetails.
			Order order1 = new Order(orderDetail_P2);
			Order order2 = new Order(orderDetail_T1);
			Order order3 = new Order(orderDetail_T3);
//			Order.returnEntireOrderDetailList(); // for test
	
			
			//6. Create a Customer with the above Order.
			Customer customerObj1 = new Customer("Yumi", "Cork 1234 Ireland");
			Customer customerObj2 = new Customer("Farshad", "Dublin 1234 Ireland");
			Customer customerObj3 = new Customer("Mary", "Galway 1234 Ireland");
			Customer.addToCustomerOrderList(customerObj1.getCustomerName(), orderDetail_P2);
			Customer.addToCustomerOrderList(customerObj2.getCustomerName(), orderDetail_T1);
			Customer.addToCustomerOrderList(customerObj3.getCustomerName(), orderDetail_T3);
//			Customer.returnEntireCustomerOrderList(); // for test
			
					
			//7. Display all products in ProductDB
			ProductDB.returnWholeProducts();

		} catch(Exception e) {
	    
			System.out.println("Something is wrong.");
	    
		} finally {
	 
			System.out.println("No exception occurs");
	 
		}
	}

}
