class Solution:
    # @param {int[]} digits a number represented as an array of digits
    # @return {int[]} the result
    def plusOne(self, digits):
        # Write your code here
        length = len(digits)
        sum = 0
        for i in xrange(length):
            sum += (10 ** (length - i - 1)) * digits[i]
        sum += 1
        new_length = 0
        if sum / (10 ** length) == 0:
            new_length = length
        else:
            new_length = length + 1
        arr = [i for i in xrange(new_length)]
        for j in xrange(new_length):
            arr[j] = sum / (10 ** (new_length - j - 1))
            sum %= 10 ** (new_length - j - 1)
        return arr


if __name__ == "__main__":
    a = [0]
    s = Solution()
    print str(s.plusOne(a))
