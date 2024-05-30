package myPackage;

public class ProtectedExample {
	protected int age; // Accessible within the same package or subclasses

    protected void protectedMethod() { // Accessible within the same package or subclasses
        
    }

	public ProtectedExample(int age) {
		super();
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age; 
		
	}
	public int getAge() {
		return age;
	}
	 
}



