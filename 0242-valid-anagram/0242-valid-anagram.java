class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hs = new HashMap<>();

        for (char c : s.toCharArray()){
            if (!hs.containsKey(c)){
                hs.put(c, 0);
            }
            hs.put(c, hs.get(c) + 1);
        }
        for (char c: t.toCharArray()){
            if (!hs.containsKey(c)){
                return false;
            }
            int res = hs.get(c) - 1;
            if (res < 0){
                return false;
            }
            hs.put(c, res);
        }
        for (int v: hs.values()){
            if (v != 0){
                return false;
            }
        }
        return true;
    }
}