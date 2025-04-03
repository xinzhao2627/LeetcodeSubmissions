class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> res = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++){
            while(res.contains(s.charAt(i)) ){
                res.remove(s.charAt(left));
                left++;
            }
            res.add(s.charAt(i));
            max = Math.max(res.size(), max);
            
        }
        return max;
    }
}