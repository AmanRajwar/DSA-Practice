/**
 * Time Complexity = O(log N)
 * space complexity = O(1)
 */
public class optimal {
    public static double median(int[] a, int[] b) {
        // fist array should be shorter
        if (a.length > b.length) {
            return median(b, a);
        }
        int x = a.length;
        int y = b.length;
        int start = 0;
        int end = x;
        int mid = (x + y + 1) / 2;

        // checking all the partition
        while (start <= end) {
            int partition1 = (start + end) / 2;// partition for first array
            int partition2 = mid - partition1;// partition for second array;

            // Now getting the max and min values from the partitioned arrays
            // for left side
            int max1 = partition1 == 0 ? Integer.MIN_VALUE : a[partition1 - 1];
            int max2 = partition2 == 0 ? Integer.MIN_VALUE : b[partition2 - 1];
            // for right side
            int min1 = partition1 == x ? Integer.MAX_VALUE : a[partition1];
            int min2 = partition2 == y ? Integer.MAX_VALUE : b[partition2];

            // checking if the partition is valid
            if (max1 <= min2 && max2 <= min1) {
                if ((x + y) % 2 == 0) {// if valid and array length combined is even then return middle
                    return (Math.max(max2, max1) + Math.min(min1, min2)) / 2.0;
                } else { // if odd then return max from left;
                    return Math.max(max2, max1);
                }
            }
            // if partition is not valid then set start and end for the next partition
            if (max1 > min2) {
                end = partition1 - 1;
            } else {
                start = partition1 + 1;
            }
        }
        return 0;
    }
}