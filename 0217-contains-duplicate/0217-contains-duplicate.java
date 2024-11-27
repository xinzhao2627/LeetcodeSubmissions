class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> a = new HashSet<>();

        for (int n: nums){
            if (!a.add(n)) return true;
        }
        return false;
    }
}