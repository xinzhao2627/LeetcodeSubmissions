class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) if (!hs.add(nums[i])) return true;
        return false;
    }
}