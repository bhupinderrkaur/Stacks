class Solution {
    static int findMaxLen(String S) {
        Stack<Integer> s=new Stack<>(); //this holds problem index
        int max=0;
        int len=0;
        s.push(-1);
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(c=='(')
                s.push(i);
                
            else{
                s.pop();
                 if(s.isEmpty())
                 s.push(i); //working w indices and not chars
                 else{
                  len=i-s.peek();
                 max=Math.max(max,len);
                 }
            }
        }
        return max;
    }
}
