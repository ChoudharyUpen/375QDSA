class twoStacks
{  
    //ek array bana liya uska size de diya
    int arr[];int size;
    //array k agha piche 2 pointer laga diya hai
    //kuki dono stack ko ek ko agha se ek ko piche se store karwa rahe hai
    int t1;int t2;
    twoStacks()
    {
        size=100;
        arr =new int[100];
        t1=-1;t2=size;
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        //check if space exits
        //example 5-4=1 so data cannot be put as there is no value
        //but 5-3=2 means there is one space for data
        if(t2-t1>1){
            arr[++t1]=x;
        }
      
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
        //check if space exits
        if(t2-t1>1){
            arr[--t2]=x;
        }
      
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(t1>=0){
            int x=arr[t1--];
            return x;
        }return-1;
      
        
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
         if(t2<size){
            int x=arr[t2++];
            return x;
        }return-1;
        
    }
}
