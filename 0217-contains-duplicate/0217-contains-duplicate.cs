public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        HashSet<int> res = new HashSet<int>();
        foreach (int n in nums) if (!res.Add(n)) return true;
        return false;
    }
}