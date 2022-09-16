// Name: Yumi Go
// Student ID: R00195941
// Group: SDH2-A

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductDB {

	Phone phoneData;
	TV TvData;
	static Map<String, String> productHashMap = new HashMap<>();
	
	ProductDB() {
	}
	
	// Constructor for Phone
	ProductDB(Phone phoneData) {
		this.phoneData = phoneData;
	}
		
	// Constructor for TV
	ProductDB(TV TvData) {
		this.TvData = TvData;
	}

	public static void addToHashMap(Phone phoneObj) {
		productHashMap.put(phoneObj.getProductID(), phoneObj.print());
	}
	
	public static void addToHashMap(TV TVobj) {
		productHashMap.put(TVobj.getProductID(), TVobj.print());
	}
		
	public static void removeFromHashMap(String productID) {
		productHashMap.remove(productID);
		System.out.println(productID + " is removed from Hash Map."); // for check
	}

	public static String findFromHashMap(String productID) {
		if(productHashMap.containsKey(productID)) {
			return "[" + productID + "] " + productHashMap.get(productID);
		} else {
			return productID + " is not exist.";
		}
	}
	
	public static void returnWholeProducts() {

		Map<String, Object> treeMap = new TreeMap<>(productHashMap);
		for (String key : treeMap.keySet()) {
		    System.out.println("[" + key + "] " + productHashMap.get(key));
		}	
	}

}

