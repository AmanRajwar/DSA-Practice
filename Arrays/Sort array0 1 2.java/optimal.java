
//time complexity = O(n);
//space complexity = O(1);


public class optimal {
    public static int[] sort(int arr[]) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int i = 0;
        while (i < end) {
            if (arr[i] == 1) {
                i++;
            }
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                i++;
                start++;
            }
            if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
           

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 2, 0, 1, 0, 1, 1, 2, 2, 1 };
        int n = arr.length;
        arr = sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
