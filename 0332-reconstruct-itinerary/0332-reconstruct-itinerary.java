class Solution {
    public void dfs(Map<String , PriorityQueue<String>> airports, String airport, List<String> res){
        PriorityQueue<String> pq= airports.get(airport);
        while(pq != null && !pq.isEmpty()){
            dfs(airports,pq.poll(), res);
        }
        res.addFirst(airport);
        
    }
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String , PriorityQueue<String>> airports = new HashMap<>();
        List<String> res=  new LinkedList<>();
        for (List<String> t : tickets){
            airports.putIfAbsent(t.get(0), new PriorityQueue<>());
            airports.get(t.get(0)).add(t.get(1));
        }
        dfs(airports, "JFK", res);
        return res;

    }
}