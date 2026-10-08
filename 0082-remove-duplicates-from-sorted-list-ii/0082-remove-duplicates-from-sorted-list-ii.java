class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            if (curr.next != null && curr.val == curr.next.val) {

                // Skip the complete duplicate group
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }

                // Remove the duplicate group
                prev.next = curr.next;

                // Move curr forward
                curr = curr.next;

            } else {

                // Current node is unique
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}