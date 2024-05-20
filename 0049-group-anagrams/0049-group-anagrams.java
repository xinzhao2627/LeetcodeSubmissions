import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String>> list = new HashMap<>();
        ArrayList<List<String>> output = new ArrayList<List<String>>();
        for (String s: strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String sca = String.valueOf(ca);
            ArrayList<String> words = (list.get(sca) == null) 
                ? new ArrayList<>()
                : list.get(sca) 
            ;
            words.add(s);
            list.put(sca, words);
        }
        list.forEach( (k, v) -> output.add(v));
        return output;
    }
}