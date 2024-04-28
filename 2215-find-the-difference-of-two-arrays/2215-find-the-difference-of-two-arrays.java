import java.util.*; 
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> dis1 = new ArrayList<Integer>();
        List<Integer> dis2 = new ArrayList<Integer>();     
        HashSet<Integer> hs1 = new HashSet<Integer>();   
        HashSet<Integer> hs2 = new HashSet<Integer>();   
        for (int n : nums1){
             if (!hs1.contains(n)){
                hs1.add(n);
             }
        }
        for (int n: nums2){
             if (!hs2.contains(n)){
                hs2.add(n);
             }
        }

        for (int n : hs1){
            if (!hs2.contains(n)){
                dis1.add(n);
            }
        }
        for (int n : hs2){
            if (!hs1.contains(n)){
                dis2.add(n);
            }
        }
        List<List<Integer>> output= new ArrayList<List<Integer>>();
        output.add(dis1);
        output.add(dis2); 
        return output;
    }
}