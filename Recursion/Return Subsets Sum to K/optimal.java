/**
 *   
 *   Time Complexity: O(2^N * N) where t is the target, k is the average length
 *  
 *   Space Complexity :  O(N * (2 ^ N)), k is the average length and x is the no. of combinations
 *  
 */ 



import java.util.ArrayList;

public class optimal {
    static void find(int ind, int n, int tar, ArrayList<ArrayList<Integer>> al, ArrayList<Integer> arr,
            ArrayList<Integer> ds) {
        if (ind == n) {
            if (tar == 0) {
                al.add(new ArrayList<>(ds));
            }
            return;
        }
        ds.add(arr.get(ind));
        find(ind + 1, n, tar - arr.get(ind), al, arr, ds);
        ds.remove(ds.size() - 1);
        find(ind + 1, n, tar, al, arr, ds);
    }

    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int tar) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        find(0, n, tar, al, arr, new ArrayList<>());
        return al;
    }
}