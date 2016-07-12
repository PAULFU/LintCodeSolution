# Definition of ListNode
class ListNode(object):
    def __init__(self, val, next=None):
        self.val = val
        self.next = next


class Solution:
    """
    @param head: A ListNode
    @return: A ListNode
    """

    def deleteDuplicates(self, head):
        # write your code here
        temp = head
        if temp is None or temp.next is None:
            return temp
        if temp.next.val == temp.val:
            temp.next = temp.next.next
        else:
            temp = temp.next
        Solution.deleteDuplicates(self, temp)
        return head

node2=ListNode(1)
node1=ListNode(1,node2)
solution=Solution()
solution.deleteDuplicates(node1)

