package interface_abstract;

public class Main {

	public static void main(String[] args) {
		// Creating objects of Dog class 
		Animal dog = new Dog();
		dog.eat();
		dog.move();
		dog.sleep();
		
		MyAbstract myAbstract = new MyAbstract() {
			
			@Override
			Void snor() {
				return null;
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void run() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void bark() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
