class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummySmall = new ListNode(0); 
        ListNode dummylarge = new ListNode(0);

        ListNode small = dummySmall;
        ListNode large = dummylarge;

        ListNode curr = head;

        while(curr != null){
            if(curr.val < x){
                small.next = curr;
                small = small.next;
            }
            else{
                large.next = curr;
                large = large.next;
            }
            
            curr = curr.next;
        }        
        large.next = null;
        small.next = dummylarge.next;
    return dummySmall.next; 
    }
}