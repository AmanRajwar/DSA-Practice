/**
 *    Time Complexity: O(c), where c = given column number.
 *    Reason: We are running a loop for r times, where r is c-1.
 *    Space Complexity: O(1) as we are not using any extra space.
 */


public class Optimal {
    public static long nCr(int n,int r){
        long res =1;
        for(int i=0;i<r;i++){
            res= res * (n-i);
            res = res/(i+1);
        }
        return res;
    }

    public static int pascalTri(int n, int r) {
        int ans = (int) nCr(n - 1, r - 1);
        return ans;
    }

    public static void main(String[] args) {
        int row = 5;
        int coll = 4;
        int ans = pascalTri(row, coll);
        System.out.println(ans);
    }
}
