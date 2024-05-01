import java.util.*;
class Solution {
    public boolean closeStrings(String word1, String word2) {
        // check if same length
        if (word1.length() != word2.length()) return false;
        
        // intiialize
        HashMap<Character, Integer> 
            w1 = new HashMap<Character, Integer>(),
            w2 = new HashMap<Character, Integer>();

        // get the frequency
        for (int i = 0; i < word1.length(); i++){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            if (w1.containsKey(c1)) 
                w1.put(c1, w1.get(c1) +1);
            else w1.put(c1, 1);

            if (w2.containsKey(c2)) 
                w2.put(c2, w2.get(c2) + 1);
            else w2.put(c2, 1);
        }
        List<Integer> 
            l1 = new ArrayList<Integer>(w1.values()),
            l2 = new ArrayList<Integer>(w2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        Iterator<Integer>
            s1 = l1.iterator(),
            s2 = l2.iterator();
        int sum1 = 0, sum2 = 0;
        while (s1.hasNext() && s2.hasNext()){
            int x1 = s1.next();
            int x2 = s2.next();
            sum1 += x1;
            sum2 += x2; 
            if (x1 != x2) {
                return false;
            }
        }
        if (sum1 != sum2) return false;
        Iterator<Map.Entry<Character, Integer>> 
            p1 = w1.entrySet().iterator(),
            p2 = w2.entrySet().iterator();
        while (p1.hasNext() && p2.hasNext()){
            Map.Entry<Character, Integer> 
                m1 = p1.next(),
                m2 = p2.next();
            char 
                k1 = m1.getKey(), 
                k2 = m2.getKey();

            if (!w2.containsKey(k1)){
                return false;
            } 
            if (!w1.containsKey(k2)){
                return false;
            }
        }
        // 
        return true;
    }
}