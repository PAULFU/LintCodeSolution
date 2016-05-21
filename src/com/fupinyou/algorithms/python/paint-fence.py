class Solution:
    # @param {int} n non-negative integer, n posts
    # @param {int} k non-negative integer, k colors
    # @return {int} an integer, the total number of ways

    def numWays(self, n, k):
        cur_k = 0
        if n == 0:
            return 0
        if n == 1:
            return k
        first_k = k
        second_k = k * (k - 1)+k
        for i in range(2, n):
            cur_k = first_k * (k - 1) + second_k * (k - 1)
            first_k = second_k
            second_k = cur_k
        return cur_k
if __name__ == '__main__':
    solution = Solution()
    rst = solution.numWays(3, 2)
    print rst
