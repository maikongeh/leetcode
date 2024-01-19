import java.rmi.server.RemoteServer;
import java.util.HashSet;
import java.util.PriorityQueue;

public class topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        class pair {
            int num;
            int freq;
            public pair(int num, int freq) {
                this.num = num;
                this.freq = freq;
            }

            public int getNum() {
                return this.num;
            }

            public int getFreq() {
                return this.freq;
            }
        }

        //create priority queue
        PriorityQueue<pair> pq = new PriorityQueue<>(new Comparator<pair>() {
            @Override
            public int compare(pair p1, pair p2) {
                return p2.getFreq() - p1.getFreq();
            }
        });

        // create hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr_num;
            if (hm.containsKey(nums[i])) {
                curr_num = hm.get(nums[i]) + 1;
            }
            else {
                curr_num = 1;
            }
            hm.put(nums[i], curr_num);
            pq.add(new pair(nums[i], curr_num));

        }

        // create a hashset of size k
        HashSet<Integer> hs = new HashSet<Integer>();
        while (hs.size() < k && pq.size() > 0) {
            int num = pq.peek().getNum();
            //System.out.println(num);
            hs.add(num);
            pq.poll();
        }
        int[] res = new int[k];
        int i=0;
        for(Integer i1: hs) {
            res[i++] = i1;
        }
        return res;
        


 
        
    }
}
