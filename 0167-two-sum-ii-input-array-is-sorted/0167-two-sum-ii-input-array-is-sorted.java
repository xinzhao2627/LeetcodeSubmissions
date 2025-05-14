class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (l < r){
            int t = numbers[l] + numbers[r];

            if (t > target){
                r--;
            } else if (t < target) {
                l++;
            } else {
                return new int[] {l+1, r+1};
            }
        }
        return new int[] {0, 0};
    }
}