
public class NestedLoop {

	public static void main(String[] args) {
		// nested loop to create a multiplication table 
		
		int rows = 10; // number of rows in the table 
		int columns = 10; 
		System.out.println("Multiplicaiton table: ");
		
		// outer loop for rows 
		for(int i = 1; i<= rows; i++) {
			
			// Inner loop for columns 
			for(int j = 1; j<= columns; j++) {
				System.out.println(i*j + "\t");
			}
			System.out.println(); // Move to the next line after each row 
		}
		
		// Nested Loop for Initializing and Printing a 2D Array
		int row = 3; // Number of rows
        int column = 4; // Number of columns

        // Create a 2D array with 3 rows and 4 columns
        int[][] array = new int[row][column];

        // Nested loop to initialize the 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = (i + 1) * (j + 1); // Initialize with multiplication
            }
        }

        // Nested loop to print the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t"); // Print element with tab for spacing
            }
            System.out.println(); // Move to the next line after each row
        }
    }

	}


