import java.util.HashSet;
import java.util.Set;
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int len=0;
        for (int num: set) {
            if (!set.contains(num-1)){
                int cnum=num;
                int current=1;
                while (set.contains(cnum+1)){
                    cnum+=1;
                    current+=1;
                }
                len=Math.max(len,current);
            }
        }
        return len;
    }
}
