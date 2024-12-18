/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //HashMap<ListNode, Integer> map = new 
        HashSet<ListNode> map = new HashSet<>();
        while(headA !=null){
            map.add(headA);
            headA = headA.next;
        }
        while(headB !=null){
            if(!map.add(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;

    }
}