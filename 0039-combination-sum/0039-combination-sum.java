class Solution {
    public void dfs(List<List<Integer>> res, List<Integer> cur, int i, int sum, int[] candidates, int target){
        if (sum == target) res.add(new ArrayList<>(cur));
        else if (sum < target && i < candidates.length){
            int n = candidates[i];

            cur.add(n);
            dfs(res, cur, i, sum+n, candidates, target);

            cur.remove(cur.size() - 1);
            dfs(res, cur, i+1, sum, candidates, target);
        }
        return;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> cur=  new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        dfs(res, cur, 0, 0, candidates, target);
        return res;
    }
}