//Two Sum   Leetcode - Easy

package Array;
import java.util.*;

public class Two_Sum{
//Brute force 
//     public static int[] TwoSum(int[] arr,int target){
//         int[] result = new int[2];
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]+arr[j]==target){
//                     result[0]=i;
//                     result[1]=j;
//                     return result;
//         }
//     }
// }
//                     return result;
//     }

//optimized (Hashtable)
     public static int[] TwoSum(int[] arr,int target){
        int[] result = new int[2];
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int comp=target-num;
            if(mpp.containsKey(comp)){
                result[0]=mpp.get(comp);
                result[1]=i;
                }
                else{
                    mpp.put(num,i);
 }
}
return result;

     }
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        int[] result=TwoSum(arr,target);
        System.out.println(result[0]+" "+result[1]);
        
    }
}
