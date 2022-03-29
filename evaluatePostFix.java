class Solution{
   
    public static int evaluatePostFix(String s){
      
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9') 
            st.push(ch-'0');
            else{
                int b = st.pop();
                int a = st.pop();
                if(s.charAt(i)=='*')
                st.push(a*b);
                else if(s.charAt(i)=='/')
                st.push(a/b);
                else if(s.charAt(i)=='+')
                st.push(a+b);
                else if(s.charAt(i)=='-')
                st.push(a-b);
            }
        }
        return st.pop();
    }
}
