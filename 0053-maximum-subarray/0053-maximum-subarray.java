class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++){
            cur = cur < 0 ? nums[i] : cur + nums[i];
            res = cur > res ? cur : res;
        }
        return res;
    }
}