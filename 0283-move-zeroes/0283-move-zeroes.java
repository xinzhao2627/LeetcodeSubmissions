class Solution {
    public void moveZeroes(int[] nums) {
        int zeroplace = -1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                if (zeroplace != -1){
                    int tmp = nums[i];
                    nums[i] = nums[zeroplace];
                    nums[zeroplace] = tmp;
                    zeroplace++;
                }
            } else if (zeroplace == -1){
                zeroplace = i; // the first zero is at ith place
            } 
        }
    }
}