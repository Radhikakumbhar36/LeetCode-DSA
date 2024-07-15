//Remove Dublicates From Sorted Array
// Leetcode - Easy

package Array;
public class RemoveDub {

    public static int RemoveDub(int[] arr){

        int rd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[rd]){
                rd++;
                arr[rd]=arr[i];
            }
        }
        return rd+1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2};
        int result =RemoveDub(arr);
        System.out.println(result);
     }
    
}
