import java.util.*;
class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        double low = Double.POSITIVE_INFINITY;
        double mid = Double.POSITIVE_INFINITY;

        for (int i = 0; i < nums.length; i++){
            
            if (nums[i] <=  low) low = nums[i];
            else if (nums[i] <= mid) mid = nums[i];
            else return true;
        }
        return false;
    }
}