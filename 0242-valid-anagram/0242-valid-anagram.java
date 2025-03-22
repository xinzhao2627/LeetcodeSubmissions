class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> res = new HashMap<>();
        HashMap<Character, Integer> res2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            res.put(s.charAt(i), res.getOrDefault(s.charAt(i), 0) + 1);
            res2.put(t.charAt(i), res2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return res.equals(res2);
    }
}