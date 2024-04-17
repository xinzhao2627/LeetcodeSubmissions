class Solution {

    
    public int maxOperations(int[] nums, int k) {
        int operation = 0, i = 0, j = nums.length - 1;
        Arrays.sort(nums);
        while (i < j && j > i){
            if (nums[i] + nums[j] == k) {
                operation++;
                i++;
                j--;
            } 
            else if (nums[i] + nums[j] > k) j--; 
            else i++;
        }
        return operation;
    }
}