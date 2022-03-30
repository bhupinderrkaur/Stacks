
//Implement Stack using two Queues
class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    
    void push(int x){
        q1.add(x);
        while(!q2.isEmpty()){
            int c=q2.peek();
            q2.remove();
            q1.add(c);
            
        }
        Queue swap=q1;
        q1=q2;
        q2=swap;
    }
    
    int pop()
    {
        int ans;
        if(!q2.isEmpty()){
        ans=q2.peek();
        q2.remove();
       }
        else ans= -1;
        return ans;
        
    }
}


//USING ONE QUEUE ONLY
class stack 
{
    Queue<Integer> queue=new LinkedList<Integer>();
    public void push(int x) 
    {
       queue.add(x);
       for(int i=0;i<queue.size()-1;i++)
       {
           queue.add(queue.poll());
       }
    }

    // Removes the element on top of the stack
    public void pop() 
    {
        queue.poll();
    }

    
    public int top() 
    {
        return queue.peek();
    }


    public boolean empty() 
    {
        return queue.isEmpty();
    }
}
