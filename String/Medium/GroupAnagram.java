package String.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            String freqString=getfrequencyString(str);
            if(map.containsKey(freqString)){
                map.get(freqString).add(str);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(freqString,list);
            }
        }
        return new ArrayList<>(map.values());
    }

    private String getfrequencyString(String strs){
        int[] arr=new int[26];
        for(char c:strs.toCharArray()){
            arr[c-'a']++;
        }
        StringBuilder res=new StringBuilder();
        char c='a';
        for(int i:arr){
            res.append(c);
            res.append(i);
            c++;
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = new GroupAnagram().groupAnagrams(strs);
        System.out.println(res);
    }
}
    

