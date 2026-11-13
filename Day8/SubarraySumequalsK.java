import java.util.HashMap;
import java.util.Map;
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0, 1);
        int count=0;
        int sum=0;  
        for(int num:nums){
            sum+=num;
            int target=sum-k;
            if(map.containsKey(target)) {
                count+=map.get(target);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum, 1);
            }
        }
        return count;
    }
}
