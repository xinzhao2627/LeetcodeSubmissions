class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> res=  new HashSet<>();
        for(int n : nums) if (!res.add(n)) return true;
        return false;
    }
}