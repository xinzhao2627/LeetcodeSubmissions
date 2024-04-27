class Solution {
    public int pivotIndex(int[] nums) {
        
        int i = 0, j= nums.length-1, left = 0, right = 0;
        int[] sumLeft = new int[nums.length], sumRight = new int[nums.length];
        while (i < nums.length && j > 0){
            sumLeft[i] = left;
            sumRight[j] = right;
            right+= nums[j--];
            left += nums[i++];
        }
        sumRight[0] = right;
        sumLeft[nums.length-1] = left;
        for (int x = 0; x < nums.length; x++){
            if (sumRight[x] == sumLeft[x]) 
                return x;
        }
        return -1;
    }
}