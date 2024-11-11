import java.util.*;

class Solution {

    public void dfs(int i, List<List<Integer>> res, List<Integer> curr_subset, int[] nums){
        if (i > nums.length - 1) {
            res.add(new ArrayList<Integer>(curr_subset));
            return;
        }
        
        curr_subset.add(nums[i]);
        dfs(i+1, res, curr_subset, nums);

        curr_subset.remove(curr_subset.size() - 1);
        dfs(i+1, res, curr_subset, nums); 
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr_subset = new ArrayList<>();

        dfs(0, res, curr_subset, nums);
        return res;
    }
}