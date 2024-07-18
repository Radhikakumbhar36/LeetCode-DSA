package Array.Medium;

public class MaxPointsFromCards {
    public static int maxScore(int[] nums,int k){
        int n=nums.length;
        int lsum=0;
        int rsum=0;
        for(int i=0;i<k;i++){
            lsum+=nums[i];
        }

        int maxSum=0;
        for(int i=0;i<k;i++){
            lsum-=nums[k-1-i];
            rsum+=nums[n-1-i];
            maxSum=Math.max(maxSum,lsum+rsum);
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int[] cards = {1, 2, 3, 4, 5,6,1};

        System.out.println(maxScore(cards,3));
    }
    
}
