class Solution:
    # @param {int[]} nums an integer array
    # @return nothing, do this in-place
    def moveZeroes(self, nums):
        for i in xrange(0,len(nums),1):
            if nums[i]==0:
                for j in xrange(i+1,len(nums),1):
                    if nums[j]!=0:
                        nums[i],nums[j]=nums[j],nums[i]
                        break
