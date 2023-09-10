/** 
 * Time Complexity = O(log N)
 * Space Complexity = O(1)
 */

public class optimal {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        if (m > n) {
            return ninjaAndLadoos(row2, row1, n, m, k);
        }
        int start = Math.max(0, k - n);// if k is greater then the second array
        int end = Math.min(m, k);
        while (start <= end) {
            int partition1 = (start + end) / 2;
            int partition2 = k - partition1;

            int max1 = partition1 == 0 ? Integer.MIN_VALUE : row1[partition1 - 1];
            int max2 = partition2 == 0 ? Integer.MIN_VALUE : row2[partition2 - 1];
            int min1 = partition1 == m ? Integer.MAX_VALUE : row1[partition1];
            int min2 = partition2 == n ? Integer.MAX_VALUE : row2[partition2];

            if (max1 <= min2 && max2 <= min1) {
                return Math.max(max2, max1);
            }
            if (max1 > min2) {
                end = partition1 - 1;
            } else {
                start = partition1 + 1;
            }
        }
        return 0;
    }
}
