import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> list = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> f = new HashMap<>();
        for (int n : nums){
            list.put(n, (list.containsKey(n) ? list.get(n) + 1 : 1));
        }
        for (Map.Entry<Integer, Integer> set : list.entrySet()){
            int key = set.getKey(), val = set.getValue();
            ArrayList<Integer> al = (f.containsKey(val)) 
                ? f.get(val)
                : new ArrayList<>()
            ;
            al.add(key);
            f.put(val, al);
        }
        ArrayList<Integer> listOfKeys = new ArrayList<>(f.keySet());
        Collections.sort(listOfKeys, Collections.reverseOrder());

        int[] x = new int[k];
        int i = 0;
        for (int p : listOfKeys){
            ArrayList<Integer> m = f.get(p);
            for (int j = 0; j < m.size(); j++){
                x[i] = m.get(j);
                i++;
                if (i == k) break;
            }
            if (i == k) break;
        }
        return x;
    }
}