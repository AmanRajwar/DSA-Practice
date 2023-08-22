
/**
 * Time Complexity = O(N^2)
 * 
 * Space Complexity = O(1)
 */

import java.util.ArrayList;
import java.util.List;

class brute {
    static List<Integer> find(int arr[]) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int nBy3 = (int) Math.floor(n / 3);
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (ans.contains(arr[i]))
                continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > nBy3) {
                ans.add(arr[i]);
            }
            count = 1;
            if (ans.size() >= 2) {
                return ans;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] array = { 1, 1, 1, 1, 2, 2, 2, 2 };
        List<Integer> ans = find(array);
        System.out.println(ans);
    }
}