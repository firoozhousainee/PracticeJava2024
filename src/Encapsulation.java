import java.security.PublicKey;

import javax.management.loading.PrivateClassLoader;

public class Encapsulation {

	
		// Encapsulation is data hiding
		public  String address; // public data 
		private String name; // private data 
		private int age;
		private long id;
		protected String assets; 
		final double soldPrice = 25259.32; // final data 
		

		static String carName = "BMW"; 
		
		// getter method to retrieve the value of name and age; not able to modify though 
		
		public String geName() {
			return name; 
		}
		
		public int getAge() {
			return age;
		}
		// setter method allows modification of the name field, with additional validation to ensure the name is not null or blank. 
		public  void setName(String name) {
			this.name = name; 
			
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		public Long getId(long id) {
			return id;
			
		}
		public void setId() {
			this.id = id; 
			
		}
		public double getSoldPrice() {
			return soldPrice;
		}
		// public data
		public String getAddress() {
			
			return address; 
			
		}
		public void setAddress(String address) {
			this.address = address; 
		}
		
		// constructor 

		public String getAssets(String assets) {
			return assets;
		}

		public void setAssets(String assets) {
			this.assets = assets;
		}

		public Encapsulation(String name, int age, long id, String assets, String address ) {
			super();
			this.name = name;
			this.age = age;
			this.id = id;
			this.address = address;;
			this.assets = assets; 
			
		}

		
		

		
	
		
		
}

