/**
 * Time Complexity = O(2N)
 * 
 * Space Complexity = O(1)
 */

import java.util.ArrayList;
import java.util.List;

public class Optimal {
    static List<Integer> find(int arr[]) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int nBy3 = (int) Math.floor(n / 3);
        int count1 = 0;
        int count2 = 0;
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < n - 1; i++) {
            if (count1 == 0 && arr[i] != num2) {
                num1 = arr[i];
                count1 = 1;
            } else if (count2 == 0 && arr[i] != num1) {
                num2 = arr[i];
                count2 = 1;
            } else if (num1 == arr[i]) {
                count1++;
            } else if (num2 == arr[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i : arr) {
            if (i == num1) {
                count1++;
            } else if (i == num2) {
                count2++;
            }
        }
        if (count1 > nBy3)
            ans.add(num1);
        if (count2 > nBy3)
            ans.add(num2);
        return ans;
    }

    public static void main(String args[]) {
        int[] array = { 1, 1, 4, 2, 2, 2, 2, 2 };
        List<Integer> ans = find(array);
        System.out.println(ans);
    }
}
