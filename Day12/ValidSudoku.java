import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows=new HashMap<>();
        Map<Integer, Set<Character>> cols=new HashMap<>();
        Map<String, Set<Character>> boxes=new HashMap<>();

        for (int r=0;r<9;r++){
            for (int c=0;c<9;c++){
                char num=board[r][c];
                if (num=='.'){
                    continue;
                }
                String boxKey=(r/3)+","+(c/3);
                boolean inRow=!rows.computeIfAbsent(r,k->new HashSet<>()).add(num);
                boolean inCol=!cols.computeIfAbsent(c,k->new HashSet<>()).add(num);
                boolean inBox=!boxes.computeIfAbsent(boxKey,k->new HashSet<>()).add(num);
                if (inRow||inCol||inBox){
                    return false;
                }
            }
        }
        return true;
    }
}
