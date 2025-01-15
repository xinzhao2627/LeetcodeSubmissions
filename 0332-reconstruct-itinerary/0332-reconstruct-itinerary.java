class Solution {
    Map<String , PriorityQueue<String>> airports = new HashMap<>();
    List<String> res = new LinkedList<>();

    public void dfs(String airport){
        PriorityQueue<String> pq= airports.get(airport);
        while(pq != null && !pq.isEmpty()) dfs(pq.poll());
        res.addFirst(airport);
        
    }
    public List<String> findItinerary(List<List<String>> tickets) {

        for (List<String> t : tickets){
            airports.putIfAbsent(t.get(0), new PriorityQueue<>());
            airports.get(t.get(0)).add(t.get(1));
        }
        dfs("JFK");
        return res;

    }
}