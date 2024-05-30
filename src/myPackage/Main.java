package myPackage;

import java.io.NotActiveException;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		ProtectedExample example = new ProtectedExample(00);// creating object of ProtectedExample class
		example.setAge(35);
		System.out.println(example.getAge());
		
		Calculator calc = new Calculator(); // creating object of Calculator class 
        
        System.out.println("Addition: " + calc.add(3, 4)); // Output: Addition: 7
        System.out.println("Multiplication: " + calc.multiply(3, 4)); // Output: Multiplication: 12
        System.out.println("Factorial of 5: " + calc.factorialOf(5)); // Output: Factorial of 5: 120
        
        
			
		}

	}


