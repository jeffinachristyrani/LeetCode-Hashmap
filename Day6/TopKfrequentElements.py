class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """

        d = {}
        for n in nums:
            d[n] = d.get(n, 0) + 1
        s = sorted(d, key=d.get, reverse=True)
        return s[:k]
