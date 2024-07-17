package  Array.Medium;

public class SortColors {

    // public static void sortColors(int[] arr){
    //     //better approach
    //     int count1=0;
    //     int count2=0;
    //     int count3=0;

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==0){
    //             count1++;
    //         }
    //         else if(arr[i]==1){
    //             count2++;
    //         }
    //         else{
    //             count3++;
    //         }
    //     }

    //     for(int i=0;i<count1;i++){
    //         arr[i]=0;
    //     }

    //     for(int i=count1;i<count1+count2;i++){
    //         arr[i]=1;
    //     }

    //     for(int i=count1+count2;i<arr.length;i++){
    //         arr[i]=2;
    //     }
    // }

    //Optimised Approach
    public static void sortColors(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    
    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

       
    }
}
