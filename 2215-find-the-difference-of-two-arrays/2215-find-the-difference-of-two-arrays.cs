using System;
using System.Collections.Generic;

public class Solution {
    public IList<IList<int>> FindDifference(int[] nums1, int[] nums2) {
        List<int> dis1 = new List<int>();
        List<int> dis2 = new List<int>();     
        HashSet<int> hs1 = new HashSet<int>();   
        HashSet<int> hs2 = new HashSet<int>();   
        
        foreach (int n in nums1) {
            if (!hs1.Contains(n)) {
                hs1.Add(n);
            }
        }
        
        foreach (int n in nums2) {
            if (!hs2.Contains(n)) {
                hs2.Add(n);
            }
        }

        foreach (int n in hs1) {
            if (!hs2.Contains(n)) {
                dis1.Add(n);
            }
        }

        foreach (int n in hs2) {
            if (!hs1.Contains(n)) {
                dis2.Add(n);
            }
        }
        
        IList<IList<int>> output = new List<IList<int>>();
        output.Add(dis1);
        output.Add(dis2); 
        return output;
    }
}
