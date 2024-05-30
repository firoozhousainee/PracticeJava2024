package leetCode;

public class MergeSortedArray {
	/*
	 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
	 * order, and two integers m and n, representing the number of elements in nums1
	 * and nums2 respectively.
	 * 
	 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
	 * 
	 * The final sorted array should not be returned by the function, but instead be
	 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
	 * n, where the first m elements denote the elements that should be merged, and
	 * the last n elements are set to 0 and should be ignored. nums2 has a length of
	 * n.
	 */
	public static void main(String[] args) {
		
		int [] num1 = {1,2,3,0,0,0};
		int [] num2 = {5, 2, 6};
		int m = 3;
		int n =3; 
		MergeSortedArray mergeArrays = new MergeSortedArray(); 
		mergeArrays.merge(num1, m, num2, n);
		
		// print the merged array 
		for (int num : num1) {
			System.out.println(num+ " ");
			
		}
		
		
		}
	public void merge(int[]num1, int m, int[]num2, int n) {
		// Initialize pointers for nums1 and nums2
		int i = m-1;
		int j = n-1;
		
		// initialize pointer for the merged array
		int k = m+n-1; 
		
		// Start merging from the end of the arrays
		while (i>=0 && j>=0) {
		// Compare elements from both arrays and place the larger one in nums1
			if(num1[i] > num2[j]) {
				num1[k] = num1[i];
				i--; 
			}
			else {
				num1[k] = num2[j];
				j--;
			}
			k--;
			
		}
		// If there are remaining elements in nums2, copy them to nums1
		while (j>=0) {
			num1[k] = num2[j];
			j--;
			k--;
			;
			
		}
		
	}
	

	}


