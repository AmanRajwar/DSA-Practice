/**
 *  Time Complexity = O(N^2)
 * Space Complexity = O(N)
 */



import java.util.ArrayList;
import java.util.Arrays;

public class brute {
	public static int[] maxSlidingWindow(int[] arr, int n, int k) {
        // Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
		for( int i=0;i<n;i++){
			if(n-i<k)break;
           int max =Integer.MIN_VALUE;
		   int j=i;
		   int count=0;
		   while(count<k ){
			   max = Math.max(max, arr[j]);
			   j++;
			   count++;
		   }
		   ans.add(max);
		}
		
	Integer[] array = ans.toArray(new Integer[ans.size()]);

// Convert Integer array to int array (if needed)
int[] intArray = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
	return intArray;	 
	}
}