package structy;

public class PrimeNum {

	public static void main(String[] args) {
		
		//int [] primeNum = {2,3,4,5,6,7,8,9};
		System.out.println(NewClass.isPrime(7));
	}
	public static boolean isPrime(int number) {
		if(number < 2) {
			return false;
		}
		for(int i =2; i<number;i+=1) {
			if(number % i == 0) {
				return false; 
			}
		}
		return true;
		
	}

}
