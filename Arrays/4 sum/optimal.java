
/**
 * 
 *   Link = https://www.codingninjas.com/codestudio/problems/4sum_5713771?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 *    
 * 
 *   Time Complexity: O(N^3), where N = size of the array.
 *   Reason: Each of the pointers i and j, is running for
 *           approximately N times. And both the pointers 
 *           k and l combined can run for approximately N 
 *           times including the operation of skipping duplicates. 
 *           So the total time complexity will be O(N^3). 
 *   
 *   Space Complexity: O(no. of quadruplets), This space is only used 
 *                     to store the answer. We are not using any extra 
 *                     space to solve this problem. So, from that 
 *                     perspective, space complexity can be written as O(1)..
*/
import java.util.*;

public class optimal {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        // checking all possible quadruplets:
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 2 && nums[j] == nums[j - 1])
                    continue;
                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                        while (k < l && nums[l] == nums[l + 1])
                            l--;
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 3, 4, 4, 2, 1, 2, 1, 1 };
        int target = 9;
        List<List<Integer>> ans = fourSum(nums, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}