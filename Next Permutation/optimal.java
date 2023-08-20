import java.util.Arrays;

class optimal {
    public static int[] nextPermutation(int arr[], int n) {
        int idx = -1;
        for (int i = n - 2; i > 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            Arrays.sort(arr);
            return (arr);
        }
        for (int j = n - 1; j < n; j++) {
            if (arr[idx] < arr[j]) {
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
                break;
            }
        }
        Arrays.sort(arr, idx + 1, n);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        arr = nextPermutation(arr, 3);
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }

}