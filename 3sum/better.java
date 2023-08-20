/**  
 *  Link - https://bit.ly/42XamEU  
 *  
 *  Time Complexity: O(N2 * log(no. of unique triplets)), where N = size of the array.
 *  
 *  Reason: Here, we are mainly using 3 nested loops. And inserting 
 *           triplets into the set takes O(log(no. of unique triplets)) 
 *           time complexity. But we are not considering the time complexity 
 *           of sorting as we are just sorting 3 elements every time.
 *  
    Space Complexity: O(2 * no. of the unique triplets) + O(N) as we are 
 *                    using a set data structure and a list to store the 
 *                    triplets and extra O(N) for storing the array elements
 *                    in another set.
 */ 



import java.util.*;

public class better {
    public static List<List<Integer>> triplet(int n, int[] arr) {
        // Write your code here.
        Set<List<Integer>> hashset = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> st = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);
                if (st.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    hashset.add(temp);
                }
                st.add(arr[j]);
            }

        }
        List<List<Integer>> ans = new ArrayList<>(hashset);
        return ans;
    }
}