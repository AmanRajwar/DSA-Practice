
public class optimal {
    public static int stock(int arr[], int n) {

        int maxProfit = 0;
        int buy = arr[0];
        for (int i = 1; i < n; i++) {
            if (buy > arr[i] ) {
                buy=arr[i];
            }
            else if(arr[i]-buy>maxProfit){
                maxProfit=arr[i]-buy;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 17, 20, 11, 9, 12, 6,100};
        int n = arr.length;
        System.out.println(stock(arr, n));
    }
}
