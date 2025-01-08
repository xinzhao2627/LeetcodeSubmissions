public class Solution {
    public int MaxSubArray(int[] nums) {
        int res = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.Length; i++){
            cur = (cur + nums[i] > nums[i]) ? cur + nums[i] : nums[i];
            res = (cur > res) ? cur : res;
        }
        return res;
    }
}