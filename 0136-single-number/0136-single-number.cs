public class Solution {
    public int SingleNumber(int[] nums) {
        return nums.Aggregate((res,cur) => res^=cur);        
    }
}