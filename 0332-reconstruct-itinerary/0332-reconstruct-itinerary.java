import java.util.*;
class Solution {
    public void dfs(String airport, HashMap<String, PriorityQueue<String>> flights, List<String> res ){
        PriorityQueue<String> pq = flights.get(airport);

        while (pq != null && !pq.isEmpty()){
            dfs(pq.poll(), flights, res);
        }

        res.addFirst(airport);
    }

    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, PriorityQueue<String>> flights = new HashMap<>();
        List<String> res = new LinkedList<>();

        for (List<String> t : tickets){
            flights.putIfAbsent(t.get(0), new PriorityQueue<String>());
            flights.get(t.get(0)).add(t.get(1));
        }
        dfs("JFK", flights, res);
        return res;
    }
}