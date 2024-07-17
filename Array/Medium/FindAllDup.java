package Array.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDup {
    //     public List<Integer> findDuplicates(int[] nums) {
    //     List<Integer> duplicates = new ArrayList<>();
    //     Set<Integer> seen = new HashSet<>();
        
    //     for (int num : nums) {
    //         if (!seen.add(Math.abs(num))) {
    //             duplicates.add(Math.abs(num));
    //         }
    //     }
        
    //     return duplicates;
    // }

    //optimal Approach
    public  static List<Integer> findDuplicate(int[] nums){
        List<Integer> duplicates = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                duplicates.add(Math.abs(nums[i]));
            }
            nums[index]=nums[index]*-1;

        }

        return duplicates;

    }
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,4,5,2};
        System.out.println(findDuplicate(arr));
        
    }
    
}
