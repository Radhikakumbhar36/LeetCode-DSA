package String.Easy;
import java.util.*;

public class LongestCommomPrefix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res=new StringBuilder();
        Arrays.sort(strs);
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();

        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;     
            }
            res.append(first[i]);
        }
        return res.toString();
    }
    
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
    }
    
}
