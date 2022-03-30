class Solution{

public  class pair implements Comparable<pair>{
       int start;
       int end;
       
       pair(){
           
       }
       pair(int start,int end)
       {
           this.start=start;
           this.end=end;
       }
       public int compareTo(pair o)
       {
           if(this.start!=o.start)
           {
               return this.start-o.start;
           }else{
             return this.end-o.end;  
           }
       }
   }
   public int[][] overlappedInterval(int[][] a)
   {
        pair[] p=new pair[a.length];
        for(int i=0;i<a.length;i++){
            p[i]=new pair(a[i][0],a[i][1]);
        }
        Arrays.sort(p);
        Stack<pair> s=new Stack<>();
        
        for(int i=0;i<p.length;i++){
            if(s.isEmpty())
            s.push(p[i]);
            
            else{
                pair t=s.peek();
                if(t.end>=p[i].start){
                s.pop();
                t.end=Math.max(t.end,p[i].end);
                s.push(t);
                }
                else {
                    s.push(p[i]);
                }
            }
        }
            
            
       int size=s.size();
       int[][] ans=new int[size][0];
       for(int h=1;h<=size;h++)
       {
           int[]arr=new int[2];
           pair pz=s.pop();
           arr[0]=pz.start;
           arr[1]=pz.end;
           ans[size-h]=arr;
       }
       
   return ans; 
  }
  
}
