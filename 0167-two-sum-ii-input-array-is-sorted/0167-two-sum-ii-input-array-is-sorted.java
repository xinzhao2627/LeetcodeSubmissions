class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) set.put(numbers[i], i);
        for (int i = 0; i < numbers.length; i++){
            int toFind = target - numbers[i];
            if (set.containsKey(toFind) && set.get(toFind) != i)
                return new int [] {i+1, set.get(toFind)+1};
        }
        return null;
    }
}