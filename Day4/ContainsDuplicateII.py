class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        dicti={}
        for i in range(len(nums)):
            num=nums[i]
            if num in dicti:
                if i-dicti[num]<=k:
                    return True
            dicti[num]=i
        return False
