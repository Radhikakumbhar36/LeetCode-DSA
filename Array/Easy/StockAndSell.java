//Best Time To Buy And Sell Stocks   Leetcode -Easy
package Array.Easy;

public class StockAndSell {

    
    //optimize approach
    public static int maxProfit(int[] arr){
        int l=0;
        int r=1;
        int maxProfit=0;
        while(r < arr.length){
            if(arr[l] < arr[r]){
                int profit= arr[r]-arr[l];
                maxProfit=Math.max(maxProfit,profit);
                }
                else{
                    l=r;
                    }
                    r++;
                    }
                    return maxProfit;

    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    
}
