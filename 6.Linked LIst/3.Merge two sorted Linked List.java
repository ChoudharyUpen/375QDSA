class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            //Recursive Comparison
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
        }
        }
        //base case of recursion 
        // one list is empty and other listt is completley full which means it is sorted
        if(list1==null)
            return list2;
        return list1;
    }
} 
