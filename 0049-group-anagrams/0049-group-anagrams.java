import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String>> list = new HashMap<>();
        ArrayList<List<String>> output = new ArrayList<List<String>>();
        for (String s: strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            ArrayList<String> words = (list.get(String.valueOf(ca)) == null) 
                ? new ArrayList<>()
                : list.get(String.valueOf(ca)) 
            ;
            words.add(s);
            list.put(String.valueOf(ca), words);
        }
        list.forEach( (k, v) -> output.add(v));

        return output;
    }
}