import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) set.put(nums[i], i);
         
        for (int i = 0; i < nums.length; i ++){
            int toFind = target - nums[i];
            if (set.containsKey(toFind) && set.get(toFind) != i)
                return new int [] {i, set.get(toFind)};
            
        }
        return null;
    }
}