class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int pointer = 0;
        HashSet<Character> set = new HashSet<>();
        for (char c: s.toCharArray()){
            while (set.contains(c)){
                set.remove(s.charAt(pointer));
                pointer++;
            }
            set.add(c);
            max = Math.max(max, set.size());
        }
        return max;
    }
}