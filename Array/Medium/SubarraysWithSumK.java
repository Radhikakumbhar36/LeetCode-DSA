package Array.Medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithSumK{

    public static int subarraySum(int[] nums, int k) {
        //optimal approach 
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1); // Initial prefix sum of 0
        
        int preSum = 0, cnt = 0;
        
        for (int num : nums) {
            preSum += num;
            
            // Compute modulo, ensuring it's positive
            int mod = (preSum % k + k) % k;
            
            // Count subarrays divisible by k
            cnt += mpp.getOrDefault(mod, 0);
            
            // Update the map with current prefix sum's modulo
            mpp.put(mod, mpp.getOrDefault(mod, 0) + 1);
        }
        
        return cnt;
    }


    public static void main(String[] args) {
        int[] arr={4,5,0,-2,-3,1};
        System.out.println(subarraySum(arr,7));
        
    }
}