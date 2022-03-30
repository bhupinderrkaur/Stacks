public class Stack {
 
    static boolean checkRedundantBrackets(String s) {
       
        Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();
        for (char ch : str) {
 
            
            if (ch == ')') {
                char top = st.peek();
                st.pop();
 
                // If immediate pop have open parenthesis '('
                // duplicate brackets found
                boolean flag = true;
 
                while (top != '(') {
 
                    // Check for operators in expression
                    if (top == '+' || top == '-'
                            || top == '*' || top == '/') {
                        flag = false;
                    }
                    top = st.peek();
                    st.pop();
                }
 
              
                if (flag == true) {
                    return true;
                }
            } else {
                st.push(ch); // push if not close parenthesis
            }               
        }
        return false;
    }
 
