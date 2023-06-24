/* Definition for singly-linked list.
 * Public class ListNode{
 * int val:
 * ListNode next;
 * ListNode(){}
 * ListNode(int val) {this.val = val; } 
 * ListNode(int val, ListNode next) { this.val = val; this.next = next ;}
 * }
 */
class Solution {
  public ListNode removeNthFormEnd(ListNode head, int n){
    if(head.next == null) {
        return null;
    }
    int size = 0;
    ListNode curr = head;
    while(curr !=null) {
        curr = curr.next;
        size++;
    }
    int indexToSearch = size - n;
    ListNode prev = head;
    int i = 1;
    while(i < indexToSearch){
        prev = prev.next;
        i++;
    }

    prev.next = prev.next.next;
    return head;
  }
}