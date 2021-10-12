
public class Store {
	// instance fields
	String productType;
	int inventoryCount;
	double inventoryPrice;
	
	// constructor method
	public Store(String product, int count, double price) {
		productType = product;
		inventoryCount = count;
		inventoryPrice = price;
	}
	
	// main method
	public static void main(String[] args) {
		Store lemonadeStand = new Store("lemonade", 42, .99);
		Store cookieShop = new Store("cookies", 12, 3.75);
		System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");	    
	    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining. G");
	    
	    
	    
	    Scanner input = new Scanner (System.in);
	    System.out.print("Input your first name: ");
	    String fname = input.next();
	    System.out.print("Input your last name: ");
	    String lname = input.next();
	    System.out.println();
	    System.out.println("Hello \n"+fname+" "+lname);
	}
	
}