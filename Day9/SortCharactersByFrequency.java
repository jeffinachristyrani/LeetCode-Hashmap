import java.util.HashMap;

class Solution{
    public String frequencySort(String s){
        HashMap<Character,Integer>m=new HashMap<>();
        char[]a=s.toCharArray();
        for(char i:a){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }else{
                m.put(i,1);
            }
        }
        StringBuilder b=new StringBuilder();
        while(!m.isEmpty()){
            char x=' ';
            int n=0;
            for(char c:m.keySet()){
                if(m.get(c)>n){
                    n=m.get(c);
                    x=c;
                }
            }
            for(int j=0;j<n;j++){
                b.append(x);
            }
            m.remove(x);
        }
        return b.toString();
    }
}
