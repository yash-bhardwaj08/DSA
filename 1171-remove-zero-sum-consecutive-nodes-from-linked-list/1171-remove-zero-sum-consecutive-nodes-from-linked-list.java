/*
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while(curr != null){
            if(curr.next != null && (curr.val + curr.next.val) == 0){
                while(curr.next != null && (curr.val + curr.next.val) == 0){
                    curr = curr.next;
                }
                prev.next = curr.next;
                curr = curr.next;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}*/
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (prev.next != null) {

            ListNode curr = prev.next;
            int sum = 0;
            boolean removed = false;

            while (curr != null) {

                sum += curr.val;

                if (sum == 0) {
                    prev.next = curr.next;
                    removed = true;
                    break;
                }

                curr = curr.next;
            }

            // Only move prev if nothing was removed
            if (!removed) {
                prev = prev.next;
            }
        }

        return dummy.next;
    }
}