class Solution {
    public void dfs (List<List<Integer>> res, List<Integer> cur, int i, int[] nums){
        if (i == nums.length ){
            List<Integer> tmp = new ArrayList<>(cur);
            res.add(tmp);
            return;
        }

        cur.add(nums[i]);
        dfs(res, cur, i+1, nums);
        cur.remove(cur.size() - 1);
        dfs(res, cur, i+1, nums);
    }


    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        dfs(res, cur, 0, nums);
        return res;
        
    }
}