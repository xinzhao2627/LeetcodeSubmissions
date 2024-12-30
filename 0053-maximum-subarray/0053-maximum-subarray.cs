public class Solution {
    public int MaxSubArray(int[] nums) {
        int res = nums[0];
        int cur = nums[0];

        for (int i = 1; i < nums.Length; i++){
            cur = Math.Max(cur + nums[i], nums[i]);
            res = Math.Max(cur, res);
        }

        return res;
    }
}