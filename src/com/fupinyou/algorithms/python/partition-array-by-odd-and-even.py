class Solution:
    # @param nums: a list of integers
    # @return: nothing

    def __init__(self):
        pass

    def partitionArray(self, nums):
        # write your code here
        odd = []
        even = []
        length=len(nums)
        for i in range(length-1,-1,-1):
            if nums[i] % 2 == 0:
                odd.append(nums[i])
            else:
                even.append(nums[i])
        nums = even + odd
        return nums
if __name__ == '__main__':
    arr = [2147483644,2147483645,2147483646,2147483647]
    s = Solution()
    k = s.partitionArray(arr)
    print k
