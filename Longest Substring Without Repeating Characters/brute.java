/**
 * Time Complexity: O( N2 )
 * 
 * Space Complexity: O(N) where N is the size of HashSet taken
 *                   for storing the elements

*/
import java.util.HashSet;

class brute {
    public static int uniqueSubstrings(String input) {
        int maxi = 0;
        for (int i = 0; i < input.length(); i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = i; j < input.length(); j++) {
                if (set.contains(input.charAt(j))) {
                    maxi = Math.max(maxi, j - i);
                    break;
                }
                set.add(input.charAt(j));
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        String str = "amanRajwar";
        System.out.println(
                "The length of the longest substring without repeating characters is " + uniqueSubstrings(str));
    }
}