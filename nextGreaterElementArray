class Solution
{
    public static long[] nextLargerElement(long[] arr, int n)
    {
        
       Stack<Long> s=new Stack<>();
       long[]out=new long[arr.length];
       for(int i=arr.length-1;i>=0;i--){
           if(s.isEmpty())
           out[i]=-1;
           
           while(!s.isEmpty() && s.peek()<=arr[i]) s.pop();
           if(s.isEmpty()) 
           out[i]=-1;
           else
           out[i]=s.peek();
           
           s.push(arr[i]);
       }
   return out;
   } 
}
