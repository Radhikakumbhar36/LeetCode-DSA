package Array.Easy;

public class MergeSortedArray {

    public static int[] SortedArray(int[] arr1,int[] arr2,int m,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while( j>=0){
            if(i>=0 && arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                k--;
                i--;
            }
            else{
                arr1[k]=arr2[j];
                k--;
                j--;
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={2,5,6};
        int m=3;
        int n=3;
        int[] arr=SortedArray(arr1,arr2,m,n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
            
        
    }
    
}
