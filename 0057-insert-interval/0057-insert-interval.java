class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for (int j = 0; j < intervals.length; j++){
            int[] i = intervals[j];
            // if new interval is before this existing interval
            if (newInterval[1] < i[0]){
                res.add(newInterval);
                for (int c = j; c < intervals.length; c++){
                    res.add(intervals[c]);
                }
                return res.toArray(new int[res.size()][]);
            }
            // if new interval is after this exisitng interval
            else if (newInterval[0] > i[1]){
                res.add(i);
            }
            // if atleast there is an integer overlap
            else {
                newInterval[0] = Math.min(i[0], newInterval[0]);
                newInterval[1] = Math.max(i[1], newInterval[1]);
            }
        }
        
        res.add(newInterval);
        
        return res.toArray(new int[res.size()][]);
    }
}