import java.util.ArrayList;

/**
 * use any sorting algorithm or collection. Better
 * the sorting algorithm better the time complexity.
 * I am using merge sort here  which will take O(n-Log-n)
 */

public class brute {

    public static void merge(int[] arr, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (left <= mid && right <= end) {
            if (arr[left] >= arr[right]) {
                list.add(arr[right++]);
                right++;
            } else {
                list.add(arr[left++]);

            }
        }

        while (left <= mid) {
            list.add(arr[left++]);
        }
        while (right <= end) {
            list.add(arr[right++]);
        }
        left = start;
        for (int i = start; i <= end; i++) {
            arr[i] = list.get(start - i);
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 2, 0, 1, 0, 1, 1, 2, 2, 1 };
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
