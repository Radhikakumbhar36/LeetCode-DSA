package String.Medium;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        StringBuilder sb=new StringBuilder();
        int[] intcode={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] code={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<intcode.length;i++){
            while(num>=intcode[i]){
                sb.append(code[i]);
                num-=intcode[i];
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int num=3749;
        System.out.println(intToRoman(num));
    }
    
}
