class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;


        while (i < j){
            int ni = numbers[i];
            int nj = numbers[j];

            if (ni + nj > target){
                j--;
            } else if (ni + nj < target){
                i++;
            } else {
                return new int[] {i+1, j+1};
            }
        }
        return new int[] {0, 0};
    }
}