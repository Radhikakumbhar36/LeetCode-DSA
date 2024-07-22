package String.Medium;

public class RevWordsInString {

    public static String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].isEmpty()){
                continue;
            }
            sb.append(arr[i]+" ");
        }

        return sb.toString().trim();

    }

    public static void main(String[] args) {

        String s = "the sky is blue";

        System.out.println(reverseWords(s));
    }
    
}

