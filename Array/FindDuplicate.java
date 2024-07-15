package Array;

public class FindDuplicate {
    //optimal Approach ----- Linked List Cycle Method
    public static int FindDuplicate(int[] arr){
        int slow=0;
        int fast=0;
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
    
        }while(slow!=fast);

        fast=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,5};
        System.out.println(FindDuplicate(arr));
    }
    
}
