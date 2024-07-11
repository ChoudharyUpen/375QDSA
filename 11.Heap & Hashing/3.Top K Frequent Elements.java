//Leetcode



class Solution {
    //implements Comparable<Pair> ye karna padega tabhi hum isa  priority queue mai use kar payenge
    class Pair implements Comparable<Pair>{
        int num,count;
        Pair(int num,int count){
            this.num=num;
            this.count=count;
        }
        public int compareTo(Pair b){
            //sorting the priority queue
            return this.count-b.count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        //adding all element of nums array into hashmap
        for(int num:nums){
            //checking if map contain the given element from array and increasing its frequency
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        //it will contain all keys of hashmap saari keys mil jayege isa huma
        Set<Integer>keys=mp.keySet();
        for(int key:keys){
            //hum k sa jayda element store nahi karwenge
            if(pq.size()<k)
            pq.add(new Pair(key,mp.get(key)));
            //agar 2 ki freq 4 hai or 3 aa gya jiski freq 7 hai tau replace
            else if(pq.peek().count<mp.get(key))
            {
                pq.poll();
                pq.add(new Pair(key,mp.get(key)));
            }
        }
        //ab is priotiy queue mai wahi element hai jo top k element hai
        //ab is ma se top k element nikalege or 1 -1 kar k store karwta jayenge
        //or uska fir return karege
        int[] arr=new int[k];
        int i=k-1;
        while(i>=0)
        arr[i--]=pq.poll().num;
        return arr;
    }
}
