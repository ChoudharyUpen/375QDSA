class Solution{
    //this question is done from anuj bahiya video
    //PriorityQueue is by default min heap so no need to find minimum
    long minCost(long arr[], int n) {
        PriorityQueue<Long> pq= new PriorityQueue<>();
       
        for(long i:arr){
            pq.add(i);
        }
        long ans=0;
        while(pq.size()>1){
            long first= pq.poll();
            long second= pq.poll();
            long sum= first+second;
            ans+=sum;
            pq.add(sum);
        }
        return ans;
        
    }
}
