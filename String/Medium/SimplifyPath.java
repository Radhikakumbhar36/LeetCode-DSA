package String.Medium;

import java.util.Stack;

public class SimplifyPath {

    public static String simplifyPath(String path) {

        String[] arr = path.split("/");
        Stack<String> st=new Stack<>();

        for(String str:arr){
            if(str.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(!str.equals(".") && !str.equals("") && !str.equals("..")){
                st.push(str);
            }
        }
             StringBuilder res=new StringBuilder();
             for(String s:st){
                res.append("/");
                res.append(s);
            }
        return res.length()==0 ? "/" : res.toString();
    }
    public static void main(String[] args) {
        String str = "/home//foo/";
        String res=simplifyPath(str);
        System.out.println(res);
    }
    
}

