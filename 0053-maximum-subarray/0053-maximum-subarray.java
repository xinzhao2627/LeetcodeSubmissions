class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++){
            cur = Math.max(cur + nums[i], nums[i]);
            res = Math.max(res, cur);
        }
        return res;
    }
}