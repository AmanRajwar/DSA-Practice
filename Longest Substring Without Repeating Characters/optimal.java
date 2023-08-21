import java.util.HashSet;

public class optimal {
    public static int uniqueSubstrings(String input) {
            int maxi = 0;
            int i=0; 
            int j=1;
            HashSet<Character> set = new HashSet<>();
            set.add(input.charAt(i));
        while(j<input.length()){
            if(set.contains(input.charAt(j))){
                set.remove(input.charAt(i));
                i++;
            }
            else{
                maxi = Math.max(maxi, j - i+1);
				set.add(input.charAt(j));
				j++;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        String str = "amanRajwar";
        System.out.println(
                "The length of the longest substring " + uniqueSubstrings(str));
    }
}