class Solution(object):
    def majorityElement(self, nums):
        dicti={}
        nums=list(nums)
        num=set(nums)
        for i in num:
            dicti[i]=nums.count(i)
        val=list(dicti.values())
        for j in val:    
            if(j>(len(nums)/2)):
                o=next(k for k,v in dicti.items() if v==j)
        return o
