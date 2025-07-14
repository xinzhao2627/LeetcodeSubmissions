class Solution {
    public int maxSubArray(int[] nums) {

        int largestSum = nums[0];
        int cur = 0;

        for (int n: nums){
            cur = cur < 0 ? n : cur + n;
            largestSum = Math.max(cur, largestSum);
        }
        return largestSum;
    }
}