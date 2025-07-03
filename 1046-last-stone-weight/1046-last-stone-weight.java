class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) pq.add(stones[i]);

        while (pq.size() > 1){
            
            int i = pq.poll();
            int j = pq.poll();
            int c = Math.abs(i - j);
            if (c != 0) pq.add(c);
        }
        return pq.isEmpty() ? 0 : pq.poll();
        
    }
}