import java.util.*;
class Solution {
    public void dfs(String airport, List<String> res, Map<String, PriorityQueue<String>> graph){
        PriorityQueue<String> pq = graph.get(airport);

        while (pq != null && !pq.isEmpty()) {
            dfs(pq.poll(), res, graph);
        }
        res.addFirst(airport);
    }

    public List<String> findItinerary(List<List<String>> tickets) {
        
        List<String> res = new LinkedList<>();

        Map<String, PriorityQueue<String>> graph = new HashMap<>();

        for (List<String> ticket : tickets){
            graph.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            graph.get(ticket.get(0)).add(ticket.get(1));
        }
        dfs("JFK", res, graph);
        return res;
    }
}