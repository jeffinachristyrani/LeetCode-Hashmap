class Solution(object):
    def isAnagram(self, s, t):
        t=list(t)
        if(len(s)!=len(t)):
            return False
        for i in s:
            if i in t:
                t.pop(t.index(i))
            else:
                return False               
        return len(t)==0
        
