class Solution {
    public void dfs(String airport,List<String> res, Map<String, PriorityQueue<String>> hm){
        PriorityQueue<String> pq = hm.get(airport);
        while (pq != null && !pq.isEmpty()){
            dfs(pq.poll(), res, hm);
        }
        res.addFirst(airport);
    }

    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> hm = new HashMap<>();
        List<String> res = new LinkedList<>();
        for (List<String> t: tickets){
            hm.putIfAbsent(t.get(0), new PriorityQueue<>());
            hm.get(t.get(0)).add(t.get(1));
        }
        dfs("JFK", res, hm);
        return res;
    }
}