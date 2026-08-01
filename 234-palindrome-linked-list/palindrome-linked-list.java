/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current=next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null && head.next == null ){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }   
        ListNode Secondhalf = reverse(slow.next);

        ListNode first = head;
        ListNode temp = Secondhalf;
        while(temp!=null){
            if(temp.val!=first.val){
                return false;
            }
            temp=temp.next;
            first=first.next;
        }
        return true;
    }
}