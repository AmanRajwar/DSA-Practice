/**
 * Algorithm = Moore’s Voting Algorithm
 * _______________________________________________________________________________________
 * 
 * Time Complexity = O(N)
 * 
 * Space Complexity = O(1)
 */
public class optimal {
    static int findMajority(int a[]) {
        int count = 0, element = 0;
        for (int i = 1; i < a.length; i++) {
            if (count == 0) {
                count = 1;
                element = a[i];
            } else if (a[i] == element)
                count++;
            else
                count--;
        }
        return element;
    }

    public static void main(String[] args) {
        int[] array = { 58, 58, 28, 95, 58, 15, 58, 58 };
        System.out.println(findMajority(array));
    }
}