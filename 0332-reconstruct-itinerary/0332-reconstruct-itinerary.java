class Solution {
    public void dfs(HashMap<String, PriorityQueue<String>> hs, List<String> res, String airport){
        PriorityQueue<String> ds = hs.get(airport);

        while (ds != null && !ds.isEmpty()){
            dfs(hs, res, ds.poll());
        }
        res.addFirst(airport);
        return;
    }
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, PriorityQueue<String>> hs = new HashMap<>();
        List<String> res = new  LinkedList<>();
        for (List<String> t: tickets){
            if (!hs.containsKey(t.get(0))) hs.put(t.get(0), new PriorityQueue<String>());
            hs.get(t.get(0)).add(t.get(1));
        }
        dfs(hs, res, "JFK");

        return res;
    }
}