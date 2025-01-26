class Solution {
    public void Dfs(List<List<Integer>> res, List<Integer> cur, int[] nums, int i){
        if (i == nums.length){
            res.add(new ArrayList<Integer>(cur));
            return;
        }

        cur.add(nums[i]);
        Dfs(res, cur, nums, i+1);

        cur.remove(cur.size() - 1);
        Dfs(res, cur, nums, i+1);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Dfs(res, cur, nums, 0);
        return res;
    }
}