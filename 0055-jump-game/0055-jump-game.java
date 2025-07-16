class Solution {
    public boolean canJump(int[] nums) {
        int steps = 0;
        for (int i = 0; i < nums.length -1; i++){
            int n = nums[i];
            if (n >= nums.length -1 ) return true;
            if (steps < n) {
                steps = n;
            } else if (steps <= 0) return false;
            steps--;
        }
        return true;
    }
}