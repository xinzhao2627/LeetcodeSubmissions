import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int res_last_val = 0;
        for (int i = 0; i< intervals.length; i++){
            if (intervals[i][0] > newInterval[1]){
                res.add(newInterval);
                res.add(intervals[i]);
                for (int j = i+1; j < intervals.length; j++) res.add(intervals[j]);
                return res.toArray(new int[res.size()][]);
            } else if (newInterval[0] > intervals[i][1]){
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