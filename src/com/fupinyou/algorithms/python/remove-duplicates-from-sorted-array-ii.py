class Solution:
    """
    @param A: a list of integers
    @return an integer
    """
    def removeDuplicates(self, A):
        # write your code here
        size = len(A)
        if size == 0:
            return
        temp = A[0] - 1
        n = 0
        m = 0
        for i in xrange(size):
            i-=n
            if A[i]!= temp:
                temp=A[i]
                m = 0
            else:
                if m < 1:
                    m += 1
                    continue
                else:
                    del A[i]
                    size-=1
                    n += 1