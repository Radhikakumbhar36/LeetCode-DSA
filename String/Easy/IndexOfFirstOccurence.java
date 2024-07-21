package String.Easy;

public class IndexOfFirstOccurence {
    public static int strStr(String haystack,String needle){

        return haystack.indexOf(needle);

    }

    // public int strStr(String haystack, String needle) {
    //     int n = haystack.length();
    //     int m = needle.length();
        
    //     if (m == 0) {
    //         return 0; // If needle is an empty string
    //     }
        
    //     for (int i = 0; i <= n - m; i++) {
    //         int j;
    //         for (j = 0; j < m; j++) {
    //             if (haystack.charAt(i + j) != needle.charAt(j)) {
    //                 break;
    //             }
    //         }
    //         if (j == m) {
    //             return i; // Found the needle
    //         }
    //     }
    //     return -1; // Needle not found
    // }
    public static void main(String[] args) {
        String haystack="butsad";
        String needle="sad";

        System.out.println(strStr(haystack, needle));
    }
    
}
