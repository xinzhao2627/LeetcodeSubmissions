import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++){
            if (newInterval[1] < intervals[i][0] ){
                res.add(new int[] {newInterval[0], newInterval[1]});
                for (int j = i; j< intervals.length; j++) res.add(new int[] {intervals[j][0], intervals[j][1]});
                return res.toArray(new int[ res.size()][]);
            } else if (intervals[i][1] < newInterval[0]){
                res.add(new int [] {intervals[i][0], intervals[i][1]});
            } else {
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }

        res.add(new int[] {newInterval[0], newInterval[1]});
        return res.toArray(new int[res.size()][]);
    }
}