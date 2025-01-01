public class Solution {
    public void Doer(IList<IList<int>> res, int i, int[] nums, IList<int> cur){
        if (i > nums.Length-1) {
            res.Add(new List<int>(cur));
            return;
        }
        cur.Add(nums[i]);
        Doer(res, i+1, nums, cur);

        cur.RemoveAt(cur.Count - 1);
        Doer(res, i+1, nums, cur);
    } 

    public IList<IList<int>> Subsets(int[] nums) {
        IList<IList<int>> res = new List<IList<int>>();
        IList<int> cur = new List<int>();
        Doer(res, 0, nums, cur);
        return res;
    }
}