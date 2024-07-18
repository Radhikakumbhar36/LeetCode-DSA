package Array.Medium;
import java.util.*;

public class SubarrayWithSumDivisibleByK {
        public static int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
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
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums, k));
    }

}
