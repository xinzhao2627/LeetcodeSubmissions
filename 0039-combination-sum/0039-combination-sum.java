class Solution {
    
    public void bt(List<List<Integer>> res, ArrayList<Integer> cur, int target, int[] candidates, int sum, int i){
        if (sum == target) {
            res.add(new ArrayList<>(cur));
        } else if (sum < target && i < candidates.length){
            cur.add(candidates[i]);
            bt(res, cur, target, candidates, sum+candidates[i], i);
            cur.remove(cur.size() - 1);
            bt(res, cur, target, candidates, sum, i+1);
        }
        return;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();

        bt(res, cur, target, candidates, 0, 0);
        return res; 

    }
}