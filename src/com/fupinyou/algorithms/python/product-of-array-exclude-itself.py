class Solution:
    """
    @param A: Given an integers array A
    @return: An integer array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
    """

    def productExcludeItself(self, A):
        length = len(A)
        B = A[:]
        for i in xrange(length):
            temp = 1
            for j in xrange(length):
                if i == j:
                    continue
                else:
                    temp = temp * A[j]
            B[i] = temp
        return B
if __name__=="__main__":
    a=[1,2,3]
    s=Solution()
    print str(s.productExcludeItself(a))
