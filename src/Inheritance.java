
public class Inheritance {

	public static void main(String[] args) {
		// 
		Encapsulation dataHiding = new Encapsulation("Name", 00, 001252, "address", "assets");
		dataHiding.setName("John Doe");
		dataHiding.setAge(33);
		dataHiding.setId();
		dataHiding.getSoldPrice();
		dataHiding.getAddress();
		dataHiding.setAddress("1133 24th ave S, Seattle, WA, 98122");
		dataHiding.getAssets("tsla, amzn, aapl, msft, googl"); 
		// printing the values 
		System.out.println("Name is: " + dataHiding.geName());
		System.out.println("Age is: " + dataHiding.getAge());
		System.out.println("Id # is: " + dataHiding.getId(0212521));
		
		// Accessing static variables from another class
		String car = Encapsulation.carName;
		System.out.println("Car name is: " + car);
		
		// can only get the price of a final field data from anther class 
		System.out.println("Car sold price is:" + dataHiding.getSoldPrice()); 
		
		// can set and get public data 
		System.out.println("Address is: " + dataHiding.address);
		System.out.println("Assets are: " + dataHiding.getAssets("tsla, amzn, aapl, msft, googl"));
	}

}
