class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur = max;
        for (int i = 0; i < nums.length; i++){
            if (cur < 0){
                cur = nums[i];
            } else {
                cur += nums[i];
            }
            if (cur > max){
                max = cur;
            }
            // if 
        }


        return max;   
    }
}