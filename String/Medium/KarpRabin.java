package String.Medium;
import java.util.*;
import java.io.*;

public class KarpRabin {
    private final int PRIME =101;
    private double calculateHash(String str){
        double hash=0;
        for(int i=0;i<str.length();i++){
            hash+=str.charAt(i)*Math.pow(PRIME,i);
        }
        return hash;
    }

    private double updateHash(double prevHash,char oldChar,char newChar,int patternlength){
        double newHash=(prevHash-oldChar)/PRIME;
        newHash=newHash+newChar*Math.pow(PRIME,patternlength-1);
        return newHash;
    }

    public void search(String text,String pattern){
        int patternLength=pattern.length();
        double patterHash=calculateHash(pattern);
        double textHash=calculateHash(text.substring(0,patternLength));

        for(int i=0;i<text.length()-pattern.length();i++)
        {
            if(patterHash==textHash){
                if(text.substring(i,i+patternLength).equals(pattern)){
                    System.out.println("Pattern found at index"+i);
                }
        }
        if(i<text.length()-patternLength){
            textHash=updateHash(textHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
        }
    }
}


    public static void main(String[] args) {
        KarpRabin algo=new KarpRabin();
        algo.search("apoorvkunalrahul", "kunal");
    }   

}
