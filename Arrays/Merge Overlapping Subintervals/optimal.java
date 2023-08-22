/**
 * Time Complexity: O(N*logN) + O(N), where N = the size of the given array.
 * 
 * Reason: Sorting the given array takes  O(N*logN) time complexity. 
 *         Now, after that, we are just using a single loop that runs for N times.
 *         So, the time complexity will be O(N).
 *
 * Space Complexity: O(N), as we are using an answer list to store the merged 
 *                   intervals. Except for the answer array, we are not using any
 *                   extra space.
 */


import java.util.*;

public class optimal {
    static List<List<Integer>> mergeOverlaps(int arr[][]) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                return a[0] - b[0];
            }
        });

        for (int i = 0; i < n; i++) {
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            } else {
                ans.get(ans.size() - 1).set(1,
                        Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 4 },
                { 3, 3 },
                { 3, 3 },
                { 3, 3 },
                { 3, 4 },
                { 4, 4 },
                { 5, 5 },
                { 5, 5 },
                { 5, 6 }
        };
        List<List<Integer>> ans = mergeOverlaps(arr);
        System.out.println(ans);
    }
}