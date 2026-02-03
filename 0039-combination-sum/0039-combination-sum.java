class Solution {
    int target;
    int[] candidates;
    public void dfs(int i, int sum, List<Integer> cur, List<List<Integer>> res ){
        if (sum == target){
            res.add(new ArrayList<>(cur));
            return;
        }

        if (i > candidates.length - 1 || sum > target) return;

        cur.add(candidates[i]);
        dfs(i, sum+candidates[i], cur, res);
        
        cur.remove(cur.size() - 1);
        dfs(i+1, sum, cur, res );
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;
        this.candidates = candidates;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(0, 0, cur, res);
        return res;
    }
}