/**
 *   Time Complexity: O(N) where N = given row number. 
 *                    Here we are using only a single loop.
 *  
 *   Space Complexity: O(1) as we not using any extra space.
 */



public class optimal {
    public static void pascalTriangle(int row) {
        System.out.print(1 + " ");
        int ans = 1;
        for (int i = 1; i < row; i++) {
            ans = ans * (row - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }
}
