package Array.Medium;
//container with most water

public class Container {
    public static int maxArea(int[] arr){
        //optimal approach
        int left=0;
        int right=arr.length-1;
        int maxArea=0;
        for(int i=0;i<arr.length;i++){
            int area=Math.min(arr[left],arr[right])*Math.abs(right-left);
            maxArea=Math.max(maxArea,area);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(arr));

    }
}
