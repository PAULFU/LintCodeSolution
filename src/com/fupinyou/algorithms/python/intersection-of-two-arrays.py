class Solution:
    # @param {int[]} nums1 an integer array
    # @param {int[]} nums2 an integer array
    # @return {int[]} an integer array
    def intersection(self, nums1, nums2):
        # Write your code here
        if nums1 == nums2:
            return nums1
        nums3 = []
        if len(nums1) > len(nums2):
            nums1, nums2 = nums2, nums1
        size = len(nums1)
        for i in xrange(0, size, 1):
            if nums1[i] in nums3:
                continue
            if nums1[i] in nums2:
                nums3.append(nums1[i])
        return nums3


A = [1, 2, 2, 1]
B = [2, 2]
solution = Solution()
C = solution.intersection(A, B)
print C
