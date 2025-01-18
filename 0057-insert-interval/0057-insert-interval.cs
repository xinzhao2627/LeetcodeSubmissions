public class Solution {
    public int[][] Insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new List<int[]>();

        for (int i = 0; i < intervals.Length; i++){
            if (newInterval[1] < intervals[i][0]){
                res.Add(newInterval);
                for(int j = i; j < intervals.Length; j++) res.Add(intervals[j]);
                return res.ToArray();
            } else if (newInterval[0] > intervals[i][1]){
                res.Add(intervals[i]);
            }
            else {
                newInterval[0] = Math.Min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.Max(intervals[i][1], newInterval[1]);
            }
        }
        res.Add(newInterval);
        return res.ToArray();
    }
}