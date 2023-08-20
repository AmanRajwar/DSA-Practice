/**
 * Time Complexity = O(N*M)
 *  
 * Space Complexity = O(1)
 */ 
class brute {
    static boolean find(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
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
        boolean ans = find(array, 45);
        System.out.println(ans);
    }
}