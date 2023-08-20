public class optimal {
 
    static int uniquePaths(int n, int m) {
       int N=n+m-2;
       int r= m-1;
       int ans = 1;
       for( int i=1;i<=r;i++){
        ans = ans* (N-r+i)/i;
       }
       return ans;
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));
    }
}
