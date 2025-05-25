class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        int res = 0;
        for (char c: s.toCharArray()){
            while (hs.contains(c)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(c);
            res = res > hs.size() ? res : hs.size();
        }
        return res;
    }
}