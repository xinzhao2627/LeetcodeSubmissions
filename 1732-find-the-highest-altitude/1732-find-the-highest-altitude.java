class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int climb = 0;
        for (int i = 0; i < gain.length; i++){
            climb += gain[i];   
            if (climb > max) {
                max = climb;
            }
        }
        return max;
    }
}