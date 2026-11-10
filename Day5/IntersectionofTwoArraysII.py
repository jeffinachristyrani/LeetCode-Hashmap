class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        l=[]
        for i in nums2:
            if i in nums1:
                l.append(i)
                nums1.pop(nums1.index(i))

        return l

        
