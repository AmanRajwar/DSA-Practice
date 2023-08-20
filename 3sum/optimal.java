/**  
 *  Link - https://bit.ly/42XamEU  
 *  
 *  Time Complexity: O(N * logN)+O(N^2), where N = size of the array.
 *  
 *  Reason: The pointer i, is running for approximately N times.
 *          And both the pointers j and k combined can run for 
 *          approximately N times including the operation of skipping 
 *          duplicates. So the total time complexity will be O(N2). 
 *  
 *  Space Complexity: O(no. of quadruplets), This space is only used 
 *                     to store the answer. We are not using any extra
 *                     space to solve this problem. So, from that perspective, 
 *                     space complexity can be written as O(1).
 */ 



import java.util.*;

public class optimal {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        // Write your code here.
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (i != 0 && arr[i] == arr[i - 1])
                continue;
            int first = arr[i];
            int left = i+1;
            int right = n - 1;
            while (left < right) {
                int sum = first + arr[left] + arr[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    List<Integer> temp = Arrays.asList(first, arr[left], arr[right]);
                    ans.add(temp);
                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1])
                        left++;
                    while (left < right && arr[right] == arr[right + 1])
                        right--;
                }
            }
        }
        return ans;
    }
}