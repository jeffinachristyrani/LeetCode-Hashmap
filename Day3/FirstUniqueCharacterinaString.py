class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        for i in s:
            if i not in s[s.index(i)+1: ]:
                return s.index(i)
        return -1
        
