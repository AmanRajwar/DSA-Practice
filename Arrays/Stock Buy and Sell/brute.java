

public class brute {
    public static int stock(int arr[], int n) {
       
        int maxProfit=0;
for(int i=0;i<n-1;i++){
    int currMaxProfit=0;
    for(int j=i+1;j<n;j++){
        currMaxProfit= Math.max(currMaxProfit,arr[j]-arr[i]);
    }
    maxProfit= Math.max(currMaxProfit,maxProfit);
}
        
        return maxProfit;
    }

    public static void main(String[] args) {
int arr[]= {17, 20, 11, 9, 12, 6};
int n= arr.length;
System.out.println(stock(arr,n));
    }
}
