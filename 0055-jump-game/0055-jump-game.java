class Solution {
    public boolean canJump(int[] nums) {
        int steps = 0;
        for (int n : nums){
            System.out.println("seps: " + steps);
            if (n >= nums.length -1 ) {
                // System.out.println(n);
                return true;
            }
            
            if (steps < n) {
                steps = n;
            } else if (steps <= 0) return false;
            steps--;
        }
        System.out.println("yea");
        return true;
    }
}