class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, climb = 0;
        for (int i = 0; i < gain.length; i++){
            climb += gain[i];   
            max = (climb > max) ? climb : max;
        }
        return max;
    }
}