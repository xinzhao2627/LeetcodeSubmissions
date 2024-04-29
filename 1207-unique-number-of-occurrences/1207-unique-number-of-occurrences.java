import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> occurences = new HashMap<Integer,Integer>();
        for (int i_key : arr){
            if (occurences.containsKey(i_key)){
                occurences.put(i_key, occurences.get(i_key)+1);
                
            } else {
                occurences.put(i_key, 1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> it = occurences.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry= it.next();
            int key = entry.getKey();
            int val = entry.getValue();
            it.remove();
            if (occurences.containsValue(val)){
                return false;
            }
        }
        return true;
    }
}