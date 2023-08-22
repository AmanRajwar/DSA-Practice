/**
 * Time Complexity = O(LogN)
 * 
 * Space Complexity = O(1)
 */
public class optimal {
    static boolean find(int arr[][], int target) {
        int size = arr.length * arr[0].length - 1;
        int start = 0;
        int end = size;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / arr[0].length;
            int coll = mid % arr[0].length;
            if (arr[row][coll] == target) {
                return true;
            } else if (arr[row][coll] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] array = {
            { 10, 20, 70, 102, 188 },
            { 214, 249, 276, 281, 372 },
            { 383, 400, 420, 449, 458 }
    };
    boolean ans = find(array, 458);
    System.out.println(ans);
    }
}
