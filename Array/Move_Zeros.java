//Move Zeros   Leetcode -Easy
package Array;
import java.util.*;

 
public class Move_Zeros {

    //Brute Force Approach
//     public static int[] moveZeroes(int n,int[] arr){
//         ArrayList<Integer> list=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             if(arr[i]!=0){
//                 list.add(arr[i]);
//             }
//         }
//         int size=list.size();
//         for(int i=0;i<size;i++){
//             arr[i]=list.get(i);
//         }
//          for (int i=size; i< size ; i++){
//             arr[i]=0;
//          }
//          return arr;

// }

//Optimal Approach 
public static int[] moveZeroes(int n,int[] arr){
    int i = 0, j = 0;
    while (i < n) {
        if (arr[i] != 0) {
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
        i++;
    }
    return arr;
}

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n=arr.length;
        int[] result=moveZeroes(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
            }
            System.out.println(" ");

        }
}







    
