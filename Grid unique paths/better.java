public class better {
    static int uniquePaths(int n, int m) {
        int arr[][] = new int[n][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 && j == m - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = (i + 1 < n ? arr[i + 1][j] : 0) + (j + 1 < m ? arr[i][j + 1] : 0);
                }
            }
            
        }
        

        return arr[0][0];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));
    }
}
