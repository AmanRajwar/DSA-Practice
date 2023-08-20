/**
 *  Time Complexity: The time complexity of this solution will be
 *                   O(n-1) or  O(m-1) depending on the formula we are using.
 * 
 *  Space Complexity: As we are not using any extra space the space
 *                    complexity of the solution will be  O(1).
 */



class brute{
    private static int helper(int i, int j, int n, int m) {
        if( i==n-1 &&  j==m-1){
            return 1;
        }
        if(i>=n || j>=m)
        return 0;

        return helper(i+1, j, n, m) + helper(i, j+1, n, m);
        
    }
    static int uniquePaths(int n, int m){
        return helper(0,0,n,m);
    }
    
    public static void main(String[] args) {
    System.out.println(uniquePaths(3, 3));
    }
}