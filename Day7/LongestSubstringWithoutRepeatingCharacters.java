import java.util.HashMap;
import java.util.Map;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> a=new HashMap<>();
        int max=0;
        int ptr=0;
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if(a.containsKey(current)&&a.get(current)>=ptr){
                ptr=a.get(current)+1;
            }
            a.put(current,i);
            int len=i-ptr+1;
            if(len>max){
                max=len;
            }
        }
        return max;
    }
}
