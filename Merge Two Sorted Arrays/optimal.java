
/**
 * Time complexity = O( max(n,m)) +  O(n*logn) + O(m* Logm) 
 * 
 * Space complexity= O(1)
 */

import java.util.Arrays;

public class optimal {
    static void merge(int arr1[], int arr2[]) {
        int end = arr1.length - 1;
        int start = 0;
        while (end >= 0 && start < arr2.length) {
            if (arr1[end] > arr2[start]) {
                int temp = arr1[end];
                arr1[end] = arr2[start];
                arr2[start] = temp;
            }
            end--;
            start++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }

    public static void main(String[] args) {
        int[] array1 = { 0, 1, 3, 5, 6 };
        int[] array2 = { 3, 4, 4, 7, 8, 8, 9, 9 };
        merge(array1, array2);
        for (int i : array1) {
            System.out.print(i + " ");
        }
        for (int i : array2) {
            System.out.print(i + " ");
        }
    }
}
