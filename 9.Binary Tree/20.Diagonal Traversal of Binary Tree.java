class Tree

{
    //making  a map for these traversal question
    Map<Integer,ArrayList<Integer>> hm;
     public ArrayList<Integer> diagonal(Node root)
      {
          //TreeMap<>() we are using TreeMap<>() here because TreeMap<>() automatiacally sorted form mai data rakhta hai
          hm=new TreeMap<>();
          //this will retrun the final ans
          ArrayList<Integer> ans= new ArrayList<>();
          //calling the function
          verticalOrder(root,0);
          //convert
          //Map se data ko fetch karna hai arraylist mai add karna hai
          for(Map.Entry<Integer,ArrayList<Integer>>e:hm.entrySet()){
              for(int i:e.getValue()){
                  ans.add(i);
              }
          }
          return ans;
          
           
                 }
    //we are creating function here which will calcualte vertical order trasveral\
    public void verticalOrder(Node root,int hd){
        if(root==null){
            return;
        }
        //humna map sa hm liya hai starting mai 0 ki value ka liya
        ArrayList<Integer> ans=hm.get(hd);
        //we are checking ans null hai kya
        if(ans==null){
            ans=new ArrayList<>();
            ans.add(root.data);
        }else
        {
            //nayi arraylist nahi bani existing arraylist mai value add karni hai
            
            ans.add(root.data);
        }
        //ab hum na arraylist mai data le liya ab usko map mai put kar denge
        hm.put(hd,ans);
        //if we are going left we are adding +1 in horizontal distance
        verticalOrder(root.left,hd+1);
         //if we are going right we are keeping the  horizontal distance same
        verticalOrder(root.right, hd);
    }
}
