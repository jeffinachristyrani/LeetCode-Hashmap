class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        s=s.split(" ")
        if len(pattern)!=len(s):
            return False
        my_dict={}
        j=0
        for i in pattern:
            if i in my_dict:
                if my_dict[i]!=s[j]:
                    return False
            else:
                my_dict[i]=s[j]
            j+=1
        return len(set(my_dict.values()))==len(my_dict.keys())

        
