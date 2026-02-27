/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

import java.util.*;

class Solution {

    public Node sortedMerge(Node head1, Node head2) {

        ArrayList<Integer> list = new ArrayList<>();

        // store the values of first linked list
        Node temp = head1;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        // store the values of second linked list
        temp = head2;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        // sort the array
        Collections.sort(list);

        // create new sorted linked list
        Node newHead = new Node(list.get(0));
        Node curr = newHead;

        for (int i = 1; i < list.size(); i++) {
            curr.next = new Node(list.get(i));
            curr = curr.next;
        }

        // return head of merged list
        return newHead;
    }
}