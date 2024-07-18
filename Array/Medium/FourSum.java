package Array.Medium;
import java.util.*;
public class FourSum {

    //Better approach using Hashing
//     public static List<List<Integer>> fourSum(int[] nums, int target) {
//         int n=nums.length;
//         Set<List<Integer>> st=new HashSet<>();
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 Set<Long> Hashset=new HashSet<>();
//                 for(int k=j+1;k<n;k++){
//                     long sum=nums[i]+nums[j];
//                     sum+=nums[k];
//                     long fourth=target-sum;
//                     if(Hashset.contains(fourth)){
//                         List<Integer> List=new ArrayList<>();
//                         List.add(nums[i]);
//                         List.add(nums[j]);
//                         List.add((int)fourth);
//                         List.add(nums[k]);
//                         Collections.sort(List);
//                         st.add(List);
//                     }
//                     Hashset.add((long)nums[k]);
                
//                 }
//         }
        
//     }
//     return new ArrayList<>(st);
// }

//optimal Approach
public static List<List<Integer>> fourSum(int[] nums, int target) {
    int n = nums.length;
    Arrays.sort(nums);
    Set<List<Integer>> result = new HashSet<>();

    for (int i = 0; i < n; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for i
        for (int j = i + 1; j < n; j++) {
            if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicates for j
            int k = j + 1;
            int l = n - 1;
            while (k < l) {
                long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                    k++;
                    l--;
                    while (k < l && nums[k] == nums[k - 1]) k++; // Skip duplicates for k
                    while (k < l && nums[l] == nums[l + 1]) l--; // Skip duplicates for l
                } else if (sum < target) {
                    k++;
                } else {
                    l--;
                }
            }
        }
    }
    return new ArrayList<>(result);
}


    public static void main(String[] args) {
        int[] nums = {4,3,3,4,4,2,1,2,1,1};

        System.out.println(fourSum(nums, 8));
    }
}
