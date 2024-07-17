package Array.Easy;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        //optimal Approach (Moore's Voting Algorithm)
        int n=nums.length;
        int count = 0;
        int element=0;
        for(int i=0;i<n;i++){
            if(count==0){
                element=nums[i];
                count=1;
                }
                else if(nums[i]==element){
                    count++;
    }
                    else{
                        count--;
        }
                        
        }
        return  element;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2,2};
        System.out.println(majorityElement(arr));
    }
}
