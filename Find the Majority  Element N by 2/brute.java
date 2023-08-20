/**
 * Time Complexity = O(N^2)
 * 
 * Space Complexity = O(1)
 */


import java.util.Arrays;

class brute {
    static int findMajority(int a[]) {
        int check = (int) Math.floor(a.length / 2);                             
        for (int i = 0; i < a.length - 1; i++) {
            int count = 1;
            for (int j : a) {
                if (j == a[i]) {
                    count++;
                }
            }
            if (count > check) {
                return a[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] array = {58, 58, 28, 95, 58, 15, 58, 58};
System.out.println(findMajority(array));

    }
}