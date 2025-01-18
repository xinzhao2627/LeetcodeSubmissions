import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int cur = 0;

        for (int i = 0; i < nums.length; i++){
            cur += nums[i];
            res = (res > cur) ? res : cur;
            cur = (cur < 0) ? 0 : cur;
        }
        return res;
    }

}