public class Solution {
    public void Dfs(int i, IList<IList<int>> res, int[] nums, IList<int> cur){
        if (i == nums.Length){
            res.Add(new List<int>(cur));
            return;
        }
        cur.Add(nums[i]);
        Dfs(i+1, res, nums, cur);

        cur.RemoveAt(cur.Count - 1);
        Dfs(i+1, res, nums, cur);

    }   
    public IList<IList<int>> Subsets(int[] nums) {
        var res = new List<IList<int>> ();
        var cur = new List<int>();
        Dfs(0, res, nums, cur);

        return new List<IList<int>> (res);
    }
}