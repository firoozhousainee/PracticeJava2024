import java.util.Random;

public class randomNumber {

	public static void main(String[] args) {
		// Random numbers generating 
				Random random = new Random();
				int randomNum = random.nextInt(101);
				System.out.println("Random number is: " + randomNum);

	}

}
