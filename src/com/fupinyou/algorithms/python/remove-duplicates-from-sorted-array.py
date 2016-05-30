class Solution:
    """
    @param A: a list of integers
    @return an integer
    """

    def removeDuplicates(self, A):
        # write your code here
        size = len(A)
        if len(A)== 0:
            return
        temp = A[0] - 1
        n = 0
        for i in xrange(size):
            i-=n
            if A[i]!= temp:
                temp=A[i]
            else:
                del A[i]
                size-=1
                n += 1


if __name__ == "__main__":
    s = Solution()
    arr = []
    s.removeDuplicates(arr)
    print str(arr)
