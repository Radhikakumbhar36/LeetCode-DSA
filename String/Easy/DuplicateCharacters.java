package String.Easy;

import java.util.*;

public class DuplicateCharacters {

    public static void printDuplicates(String str){
        HashMap<Character,Integer> mpp=new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(mpp.containsKey(str.charAt(i))){
                mpp.put(str.charAt(i),mpp.get(str.charAt(i))+1); 
            }
            else{
                mpp.put(str.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> ele:mpp.entrySet()){
            if(ele.getValue()>1){
                System.out.println(ele.getKey());
            }

        }
            

    }
   
    public static void main(String[] args) {
        String  str="test string";
        printDuplicates(str);
    }

    
}
