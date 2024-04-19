class Solution {
    public int maxVowels(String s, int k) {
        ArrayList<Character> scrollbar = new ArrayList<>();
        String v = "aeiou";
        int max = 0;
        for(int i = 0; i < k; i++) {
            scrollbar.add(s.charAt(i));   
            max = (v.indexOf(s.charAt(i)) == -1) ? max : ++max;
        } 
        int result = max;
        for (int i = k; i < s.length(); i++){
            max = (v.indexOf(scrollbar.get(0)) != -1) ? --max : max;
            max = (v.indexOf(s.charAt(i)) != -1) ? ++max : max;
            scrollbar.remove(0);
            scrollbar.add(s.charAt(i));
            result = (max > result) ? max : result;
        }   
        return result;
    }
}