class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int cur = 0;

        for (int i = 0; i < nums.length; i++){
            int n = nums[i];
            cur = cur < 0 ? n : cur + n;
            sum = Math.max(cur, sum); 
        }
        return sum;
    }
}