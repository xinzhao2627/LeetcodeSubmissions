import java.util.*;
class Solution {
    public void dfs(String airport, List<String> res, Map<String, PriorityQueue<String>> travel){
        PriorityQueue<String> q = travel.get(airport);

        while  (q != null && !q.isEmpty() ){
            dfs(q.poll(), res, travel);
        }
        res.addFirst(airport);
    }
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> travel = new HashMap<>();
        List<String> res = new LinkedList<>();

        for (List<String> t : tickets){
            travel.putIfAbsent(t.get(0), new PriorityQueue<>());
            travel.get(t.get(0)).add(t.get(1));
        }
        dfs("JFK",res, travel);
        return res;
    }
}