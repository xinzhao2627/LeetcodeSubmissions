class Solution {
    public static void dfs(List<Integer> cur, List<List<Integer>> res, int i, int[] nums){
        if (i > nums.length-1){
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        cur.add(nums[i]);
        dfs(cur, res, i+1, nums);

        cur.remove(cur.size() - 1);
        dfs(cur, res, i+1, nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        dfs(cur, res, 0, nums);
        return res;
    }
}