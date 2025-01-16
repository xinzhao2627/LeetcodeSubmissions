public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        HashSet<int> ss = new HashSet<int>();
        for (int i = 0; i < nums.Length; i++) if(!ss.Add(nums[i])) return true;
        return false;
    }
}