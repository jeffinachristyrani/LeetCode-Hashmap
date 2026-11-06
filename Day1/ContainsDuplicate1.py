class Solution(object):
    def containsDuplicate(self, nums):
        num=set(nums)
        if(len(num)<len(nums)):
            return True
        return False 
