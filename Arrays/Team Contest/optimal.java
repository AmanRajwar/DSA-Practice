/**
 * Time Complexity: O(2N*logN), where N = size of the given array.
Reason: Inside the mergeSort() we call merge() and countPairs() except
        mergeSort() itself. Now, inside the function countPairs(), 
        though we are running a nested loop, we are actually iterating
        the left half once and the right half once in total. That is why, 
        the time complexity is O(N). And the merge() function also takes O(N). 
        The mergeSort() takes O(logN) time complexity. Therefore, the 
        overall time complexity will be O(logN * (N+N)) = O(2N*logN).

Space Complexity: O(N), as in the merge sort We use a temporary array to store elements in sorted order.
 */



import java.util.ArrayList;
import java.util.List;

public class optimal {
    static void merge(int arr[], int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        List<Integer> ans = new ArrayList<>();
        while (left <= mid && right <= end) {
            if (arr[left] >= arr[right]) {
                ans.add(arr[right]);
                right++;
            } else {
                ans.add(arr[left]);
                left++;
            }
        }

        while (left <= mid) {
            ans.add(arr[left++]);
        }
        while (right <= end) {
            ans.add(arr[right++]);
        }

        for (int i = start; i <= end; i++) {
            arr[i] = ans.get(i - start);
        }

    }

    static int countPairs(int arr[], int start, int end, int mid) {
        int count = 0;
        int idx = mid + 1;
        for (int i = start; i <= mid; i++) {
            while (idx <= end && arr[i] > 2 * arr[idx]) {
                idx++;
            }
            count = count + (idx - (mid + 1));
        }
        return count;
    }

    static int mergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return 0;
        }
        int mid = (start + end) / 2;
        int count = mergeSort(arr, start, mid) + mergeSort(arr, mid + 1, end);
        count += countPairs(arr, start, end, mid);
        merge(arr, start, mid, end);
        return count;
    }

    public static int team(int[] skill, int n) {
        // Write your code here.
        return mergeSort(skill, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] array = { 727, 349, 916, 7, 595, 873, 516, 960, 976, 170, 662, 317, 529, 702, 789, 256, 75, 575, 330, 339,
                584, 239, 31, 173, 929, 967, 20, 654, 780, 478, 337, 67, 343, 14, 415, 842, 908 };
        System.out.println(team(array, array.length));
    }
}
