public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        HashSet<int> ss = new HashSet<int>();
        foreach (int n in nums) if(!ss.Add(n)) return true;
        return false;
    }
}