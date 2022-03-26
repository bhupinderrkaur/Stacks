class Solution
{
    static boolean ispar(String x)
    {
       Stack <Character> st=new Stack<>();
       for(int i=0;i<x.length();i++){
           char c=x.charAt(i);
           if(st.isEmpty() || c=='(' || c=='{' || c=='[') 
           st.push(c);
           
           else if((c==')' && st.peek()=='(') ||(c=='}'&&st.peek()=='{')||(c==']'&&st.peek()=='['))
           st.pop();
            else return false;
        }
        return st.size()==0;
       }
    }

