class Solution {
    public void ss (List<Integer> cur, List<List<Integer>> res, int[] nums, int i){
        if (i == nums.length) {
            res.add(new ArrayList<Integer>(cur));
            return ;
        }

        cur.add(nums[i]);
        ss(cur, res, nums, i+1);

        cur.remove(cur.size() - 1);
        ss(cur, res, nums, i+1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        ss(cur, res, nums, 0);
        return res;
    }
}