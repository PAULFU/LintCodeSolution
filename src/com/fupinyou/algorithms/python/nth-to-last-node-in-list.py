class ListNode(object):
    def __init__(self, val, next=None):
        self.val = val
        self.next = next


class Solution:
    """
    @param head: The first node of linked list.
    @param n: An integer.
    @return: Nth to last node of a singly linked list.
    """
    def __init__(self):
        pass

    def nth_to_last(self, head, n):
        if head is None or n < 1:
            return None
        cur = head.next
        while cur is not None:
            cur.pre = head
            cur = cur.next
            head = head.next
        n -= 1
        while n > 0:
            head = head.pre
            n -= 1
        return head.val
        pass

node_1 = ListNode(1)
node_2 = ListNode(2, node_1)
node_3 = ListNode(3, node_2)
node_4 = ListNode(4, node_3)
node_5 = ListNode(5, node_4)
solution = Solution()
print str(solution.nth_to_last(node_5, 2))


