class Solution(object):
    def twoSum(self, nums, target):
        n={}
        for i,num in enumerate(nums):
            neg=target-num
            if neg in n:
                return [n[neg],i]
            n[num]=i
        return []
