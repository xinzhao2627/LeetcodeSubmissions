import java.util.*;
class Solution {
    public void dfs(String airport, Map<String, PriorityQueue<String>> graph, LinkedList<String> res){
        PriorityQueue<String> target = graph.get(airport);

        while (target != null && !target.isEmpty()){
            dfs(target.poll(), graph, res);
        }
        res.addFirst(airport);
    }


    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        LinkedList<String> res = new LinkedList<>();
        for (List<String> t : tickets){
            graph.putIfAbsent(t.get(0), new PriorityQueue<>());

            // get the sorted list of destination of that "from", and add 
            // e.g JFK: [ATL, ABC, EFG]
            PriorityQueue<String> travelled_to = graph.get(t.get(0));
            travelled_to.add(t.get(1));
        }
        dfs("JFK", graph, res);

        return res;
    }
}