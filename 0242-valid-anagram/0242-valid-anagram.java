import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> freq1 = new HashMap<>();
        HashMap <Character, Integer> freq2 = new HashMap<>();
        for (char c1 : s.toCharArray())
            freq1.put(c1, ((freq1.containsKey(c1)) ? freq1.get(c1)+1: 1));
        
        for (char c2 : t.toCharArray())
            freq2.put(c2, ((freq2.containsKey(c2)) ? freq2.get(c2)+1: 1));
        
        return (freq1.equals(freq2)) ? true: false;
    }
}