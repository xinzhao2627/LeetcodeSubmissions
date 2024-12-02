import java.util.*;
class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for (int n : nums){
            pq.add(n);
        }
        int i = pq.size();
        while ( i > k){
            pq.remove();
            i--;
        }
    }
    
    public int add(int val) {
        pq.add(val);

        if (pq.size() > k) pq.remove();

        return pq.peek(); 
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */