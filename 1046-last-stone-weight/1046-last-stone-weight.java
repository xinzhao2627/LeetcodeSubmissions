class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int n: stones) pq.add(n);

        while (pq.size() > 1){
            int i = pq.poll();
            int j = pq.poll();
            pq.add(i - j);
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}