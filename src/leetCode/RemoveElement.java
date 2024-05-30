package leetCode;

public class RemoveElement {
	
	// remove all occurences of val in nums 
	// consider the order of the array maybe changes 
	// nums != val is k
	// k's first elements must not be val's elements 

	// To solve this problem(removing all occurences of val from array nums and returning the new length of the array, we can use the two-pointer method 
	public int removeElement(int[]nums, int val) {
		int k =0;
		int n = nums.length;
		for(int i =0; i<n; i++) {
			if(nums[i] !=val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
	public static void main(String[]args) {
		RemoveElement re = new RemoveElement();
		
				
		int [] nums = {3,2,2,3,4,5};
		int val = 3; 
		
		int k = re.removeElement(nums, val);
		System.err.println("New length " + k);
		
		// To verify the correct elements remain in the first `k` positions
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
			
		}
		System.err.println();
		

		
	}
	
		
	
	
	
	

}
