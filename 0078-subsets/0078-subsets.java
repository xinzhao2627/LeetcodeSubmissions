import java.util.*;

class Solution {
    public void dfs (int i, List<List<Integer>> res, List<Integer> cur, int[] nums){

        if (i > nums.length - 1) {
            res.add(new ArrayList<Integer>(cur));
            return;
        } 

        cur.add(nums[i]);
        dfs(i+1, res, cur, nums);

        cur.remove(cur.size() - 1);
        dfs(i+1, res, cur, nums);
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        dfs(0, res, cur, nums);

        return res;


    }
}