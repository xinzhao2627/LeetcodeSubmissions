class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, largest = 0;
        for (int n : nums){
            if (n == 1) 
                count++;
            else {
                largest =(count > largest) ?count: largest;
                count = 0;
            }
        }
        return (count > largest) ? count : largest;
        
    }
}