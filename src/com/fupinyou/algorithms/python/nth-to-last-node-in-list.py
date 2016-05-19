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

    def nthToLast(self, head, n):
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
        return head
        pass



