class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0.0;
        int j = k-1;
        for(int i = 0; i < k; i++)// get the initial bar
            max += nums[i]; 
        double result = max;       
        for (int i = k; i < nums.length; i++){
            max = max - nums[i - k] + nums[i];
            result = (max > result) ? max : result;   
        }   
        return result/k;
    }
}
