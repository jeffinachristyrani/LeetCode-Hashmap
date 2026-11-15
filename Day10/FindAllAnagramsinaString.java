import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s,String p) {
        List<Integer> res=new ArrayList<>();
        if(s.length()<p.length()) return res;
        Map<Character,Integer> pMap=new HashMap<>();
        Map<Character,Integer> sMap=new HashMap<>();
        for(int i=0;i<p.length();i++) {
            pMap.put(p.charAt(i),pMap.getOrDefault(p.charAt(i),0)+1);
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }
        if(pMap.equals(sMap)) res.add(0);
        int left=0;
        for(int right=p.length();right<s.length();right++) {
            char rightChar=s.charAt(right);
            sMap.put(rightChar,sMap.getOrDefault(rightChar,0)+1);
            char leftChar=s.charAt(left);
            if(sMap.get(leftChar)==1) sMap.remove(leftChar);
            else sMap.put(leftChar,sMap.get(leftChar)-1);
            left++;
            if(pMap.equals(sMap)) res.add(left);
        }
        return res;
    }
}
