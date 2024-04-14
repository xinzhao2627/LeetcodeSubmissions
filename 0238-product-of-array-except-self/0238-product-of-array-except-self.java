import java.util.*;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] outputs = new int[nums.length];
        ArrayList<Integer> suffix = new ArrayList<>();
        ArrayList<Integer> prefix = new ArrayList<>();
        suffix.add(1);
        prefix.add(1);
        int i = 1;
        int j = nums.length - 2;
        while (i < nums.length && j > -1){
            suffix.add(nums[i-1]*suffix.get(i-1));
            prefix.add(nums[j+1]*prefix.get(i-1));
            i++;
            j--;
        }
        for(i = 0; i < nums.length; i++)
            outputs[i] = suffix.get(i)* prefix.get(nums.length-i-1)
        ;
        
        return outputs;
    }
}