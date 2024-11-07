import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        var ss = new HashSet<Integer>(); 
        for (int i : nums){
            if (!ss.add(i)) return true;
        }
        return false;
    }
}