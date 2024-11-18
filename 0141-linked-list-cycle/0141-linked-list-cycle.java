/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> map = new HashSet<>();
        ListNode current = head;
        while(current!=null){
            if(map.contains(current)){
                return true;
            }
            map.add(current);
            current = current.next;
        }
        return false;
    }
}