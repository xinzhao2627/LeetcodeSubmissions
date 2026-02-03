class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] prev = intervals[0];
        int[][] res = new int[intervals.length][];
        int j = 0;
        for (int i = 1; i < intervals.length; i++){
            int[] interval = intervals[i];
            if (interval[0] <= prev[1]){
                prev[0] = Math.min(interval[0], prev[0]);
                prev[1] = Math.max(interval[1], prev[1]);
            } else {
                res[j++]= prev;
                prev = interval;
            }
        }
        res[j] = prev;
        return Arrays.copyOf(res, j+1);
    }
}