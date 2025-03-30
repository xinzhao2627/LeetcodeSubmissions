class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> res = new HashMap<>();
        for (int i = 0; i < s.length(); i++) res.put(s.charAt(i), res.getOrDefault(s.charAt(i), 0) + 1);
        for (int i = 0; i < t.length(); i++) res.put(t.charAt(i), res.getOrDefault(t.charAt(i), 0) - 1);
        for (int n : res.values()) if (n != 0) return false;
        return true; 

    }
}