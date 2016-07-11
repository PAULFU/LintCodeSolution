class Solution:
    # @param {int[]} A an integer array
    # @return nothing
    def sortIntegers(self, A):
        size = len(A)
        for i in xrange(size - 1, 0, -1):
            for j in xrange(0, i, 1):
                if A[j] > A[i]:
                    A[i], A[j] = A[j], A[i]
                else:
                    continue


B = [3, 2, 1, 4, 5]
solution = Solution()
solution.sortIntegers(B)
print B
