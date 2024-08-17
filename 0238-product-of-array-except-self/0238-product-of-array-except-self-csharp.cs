public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int[] output = new int[nums.Length];
        int z = 0;
        int p = 1;
        for (int i = 0; i < nums.Length; i++){
            if (nums[i] == 0) {
                z++;
                continue;
            }
            p *= nums[i];
        }
        if (z == 1){
            for (int i = 0; i < nums.Length; i++){
                output[i] = (nums[i] == 0) ? p : 0; 
            }
        } else if (z == 0){
            for (int i = 0; i < nums.Length; i++){
                output[i] = p/nums[i];
            }
        }
        return output;
    }
}