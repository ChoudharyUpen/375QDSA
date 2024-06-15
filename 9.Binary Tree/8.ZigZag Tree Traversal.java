class GFG
{
//     Approach:
// Step1 Make two stack s1 and s2
// Step2 Fill s1 and s2 differntly
// Step3 in s1 fill right left
// Step4 in s2 fill left right
// Step5 then popping it and printing it.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> a1=new ArrayList<>();
	    Stack <Node>s1=new Stack<>();
	    Stack <Node>s2=new Stack<>();
	    
	    s1.push(root);
	    while(!s1.isEmpty()||!s2.isEmpty()){
	        while(!s1.isEmpty()){
	            Node temp=s1.pop();
	            System.out.print(temp.data+" ");
	            
	            if(temp.left!=null){
	                s2.push(temp.left);
	            }
	            if(temp.right!=null){
	                s2.push(temp.right);
	            }
	        }
	        while(!s2.isEmpty()){
	            Node temp=s2.pop();
	            System.out.print(temp.data+" ");
	            
	            if(temp.right!=null){
	                s1.push(temp.right);
	            }
	            if(temp.left!=null){
	                s1.push(temp.left);
	            }
	        }
	    }return a1;
}
}
