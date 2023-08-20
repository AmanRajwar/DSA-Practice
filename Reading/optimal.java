/**
 * Link = https://bit.ly/3Iu7zMu
 * 
 * Time Complexity = O(N)
 * 
 * Space Complexity = O(N);
 */


import java.util.HashMap;

public class optimal {
    public static String read(int n, int []book, int target){
        // Write your code here.
        String a= "NO";
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int i=0;i<book.length;i++){
            int value =target-book[i];
            if( map.containsKey(value)){
                a="YES";
                break;
            }
            map.put(book[i], target-book[i]);
        }
       
        return a;
    }
    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = read(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
}
