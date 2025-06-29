class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> res = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            res.put(c, res.containsKey(c) ? res.get(c)+1 : 1);
        }

        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if (!res.containsKey(c)) return false;
            res.put(c, res.get(c)-1);
        }

        for (int j : res.values()) if (j != 0) return false;

        return true;
    }
}