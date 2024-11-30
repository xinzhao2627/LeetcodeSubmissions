class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++){
            if (newInterval[1] < intervals[i][0]){
                res.add(newInterval);
                for (int j = i; j < intervals.length; j++){
                    res.add(intervals[j]);
                }
                return res.toArray(new int[res.size()][]);
            }
            else if (intervals[i][1] < newInterval[0]){
                res.add(intervals[i]);
            } else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);

            }
        } 
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}