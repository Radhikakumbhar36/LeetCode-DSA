package Array.Medium;

import java.util.Stack;

public class ValidParentheses {
    public  static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '[' || current == '{') {
                st.push(current);
            } else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if ((current == ')' && top != '(') || 
                    (current == ']' && top != '[') || 
                    (current == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }


    public static void main(String[] args) {
        String s="()";
        System.out.println(isValid(s));
    }
    
}
