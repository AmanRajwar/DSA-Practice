/**
 * Link = https://bit.ly/3Iu7zMu
 * 
 * Time Complexity = O(N) + O(N * LogN) 
 * 
 * Space Complexity = O(1);
 * 
 *   If interviewer asks to do it without using map 
 *   but the array will be distorted 
 */


import java.util.Arrays;

public class optimal1 {
     public static String read(int n, int []book, int target){
        // Write your code here.
       int left=0;
       int right= book.length-1;
       Arrays.sort(book);
       while(left<right){
        int sum = book[left]+ book[right];
        if(sum==target){
            return "YES";
        }
        else if(target>sum){
            left++;
        }else{
            right--;
        }
       }
       
        return "NO";
    }
    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = read(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
}
