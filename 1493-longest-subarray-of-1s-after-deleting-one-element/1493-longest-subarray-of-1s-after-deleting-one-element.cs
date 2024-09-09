public class Solution {
    public int LongestSubarray(int[] nums) {
        // Initialize variables to store the current and previous lengths of subarrays of 1s
        int curr = 0, prev= 0;
        // Initialize a variable to store the maximum length of subarray of 1s
        int result= 0;
        for(int i = 0; i < nums.Length; i++){
            // If the current element is 1, increment the current length
            if(nums[i] == 1) curr++;
            // Otherwise, update the maximum length with the sum of current and previous lengths
            else{
                result = Math.Max(result, curr+prev);
                prev = curr;
                curr = 0;
            }
        }
        // Update the maximum length with the final sum of current and previous lengths
        result = Math.Max(result, curr+prev);
        // Return the maximum length, or one less if the whole array is 1s
        return (result == nums.Length)? result - 1: result;
    }
}