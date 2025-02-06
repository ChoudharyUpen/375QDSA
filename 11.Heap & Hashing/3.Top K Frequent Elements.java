class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] ans = new int[k];
        int pos = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size() && pos < k; j++) {
                    ans[pos] = bucket[i].get(j);
                    pos++;
                }
            }
        }
        return ans;
    }
}





















//Leetcode
//this is better & easy to learn the approach then approach given below


Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]


    
class Solution {
    // Function topKFrequent jo array nums aur integer k ko leta hai aur k frequent elements return karta hai
    public int[] topKFrequent(int[] nums, int k) {
        // List array create karte hain jiska size nums.length + 1 hai
        // Yeh buckets frequencies ko store karne ke liye use hoga
        List<Integer>[] bucket = new List[nums.length + 1];
        
        // HashMap banate hain jo key ko number aur value ko us number ka frequency rakhega
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        // For loop use karke hum har number ka frequency count karte hain aur HashMap mein store karte hain
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        // Har key (number) ke liye uska frequency nikalte hain
        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            // Agar bucket mein yeh frequency null hai toh new ArrayList banate hain
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            // Us number ko uski frequency ke bucket mein add karte hain
            bucket[freq].add(key);
        }
        
        // Answer array banate hain jisme k elements honge
        int[] ans = new int[k];
        int pos = 0;
        
        // Reverse order mein bucket iterate karte hain
        // Taaki highest frequency wale elements pehle mil sakein
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                // Har bucket ke elements ko answer array mein add karte hain
                for (int j = 0; j < bucket[i].size() && pos < k; j++) {
                    ans[pos] = bucket[i].get(j);
                    pos++;
                }
            }
        }
        
        // Answer array return karte hain
        return ans;
    }
}






//improve this code futher beacause it seems hard to understand this solution


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
