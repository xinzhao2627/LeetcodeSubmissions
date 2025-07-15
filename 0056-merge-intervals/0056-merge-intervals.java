class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] prev = intervals[0];
        List<int[]> res = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++){
            int[] interval = intervals[i];
            if (interval[0] <= prev[1]){
                prev[0] = Math.min(interval[0], prev[0]);
                prev[1] = Math.max(interval[1], prev[1]);
            } else {
                res.add(prev);
                prev = interval;
            }
        }
        res.add(prev);
        return res.toArray(new int[res.size()][]);
    }
}