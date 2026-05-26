class Solution {
    public int[] twoSum(int[] numbers, int target) {
    
        int left = 0;
        int right = numbers.length  - 1;

        while (left < right){
            int s1 = numbers[left];
            int s2 = numbers[right];
            int sum = s1 + s2;
            if (sum > target){
                right = right - 1;
            } else if (sum < target) {
                left = left + 1;
            } else if (sum == target) {
                return new int[] {left+1, right+1};             
            }
        }
        return new int[] {-1, -1};
    }
}