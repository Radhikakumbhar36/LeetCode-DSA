package String.Medium;

import java.util.Stack;

public class BasicCalculator {

    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        char prevSign = '+';
        int no = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                no = no * 10 + (c - '0'); // Build the number from multiple digits
            }
            if (isOperator(c) || i == s.length() - 1) { // Check if current character is an operator or last character in the string
                if (prevSign == '+') {
                    st.push(no);
                } else if (prevSign == '-') {
                    st.push(-no);
                } else if (prevSign == '*') {
                    st.push(st.pop() * no);
                } else if (prevSign == '/') {
                    st.push(st.pop() / no);
                }
                prevSign = c; // Update the previous sign
                no = 0; // Reset the number
            }
        }
        int res = 0;
        while (!st.isEmpty()) {
            res += st.pop();
        }
        return res;
    }

    public boolean isOperator(Character c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    
    public static void main(String[] args) {
        BasicCalculator bc=new BasicCalculator();

        System.out.println(bc.calculate("3+2*2"));
    }
    
}
