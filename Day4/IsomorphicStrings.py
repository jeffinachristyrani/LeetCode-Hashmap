class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t):
            return False
            
        dicti={}
        for i in range(len(s)):
            char_s=s[i]
            char_t=t[i]
            if char_s in dicti:
                if dicti[char_s]!=char_t:
                    return False
            else:
                if char_t in dicti.values():
                    return False
                dicti[char_s]=char_t
        return True
