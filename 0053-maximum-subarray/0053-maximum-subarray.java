class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int cur = 0;

        for (int n : nums){
            cur = cur < 0 ? n : cur + n;
            sum = Math.max(cur, sum); 
        }
        return sum;
    }
}