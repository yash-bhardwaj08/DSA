class Solution {
    public void deleteNode(ListNode node) { //eg 4 5 1 6
        node.val = node.next.val; // 4 1 1 6  -> 1 copied to node which is to delete
        node.next = node.next.next; // 4 1 6  -> skipping the node next to node*
    }
}