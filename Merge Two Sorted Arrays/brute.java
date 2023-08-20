/**
 * Time complexity = O(n+m) where n= size of arr1 and m= size of arr2
 * 
 * Space complexity= O(n+m) as we are using an extra array of size n+m.
 */
class brute {
    static int[] merge(int arr1[], int arr2[]) {
        int arr[] = new int[arr1.length + arr2.length];
        int s1 = 0;
        int s2 = 0;
        int i = 0;
        while (s1 < arr1.length && s2 < arr2.length) {
            if (arr1[s1] > arr2[s2]) {
                arr[i++] = arr2[s2++];
            } else {
                arr[i++] = arr1[s1++];
            }
        }
        while (s1 < arr1.length) {
            arr[i++] = arr1[s1++];
        }
        while (s2 < arr2.length) {
            arr[i++] = arr2[s2++];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array1 = { 0, 1, 3, 5, 6 };
        int[] array2 = { 3, 4, 4, 7, 8, 8, 9, 9 };
        int arr[] = merge(array1, array2);
        for (int i : arr) {
            System.out.print(i+" ");

        }
    }
}