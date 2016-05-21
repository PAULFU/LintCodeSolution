def numWays(n, k):
    # Write your code here
    if n == 0:
        return 0
    if n == 1:
        return k
    return (numWays(n - 1, k) * (k - 1) + numWays(n - 2, k) * (k - 1))
if __name__ == '__main__':
    rst = numWays(3, 2)
    print rst
