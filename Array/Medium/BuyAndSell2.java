package Array.Medium;

//we can use this problem using dynamic programming also
//explore that

public class BuyAndSell2 {

    public static int maxProfit(int[] arr){
        int maxProfit=0;
        int n=arr.length;
        for (int i =1;i<n;i++){
            if(arr[i]>arr[i-1]){
                maxProfit+=arr[i]-arr[i-1];
            }
        }return maxProfit;    
    }


    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        System.out.println(maxProfit(arr));
    }
    
}
