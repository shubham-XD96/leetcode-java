package linkedlist;
class Main {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Remove Nth node from the end
    static ListNode removeNthFromEnd(ListNode head, int n) {

        // Create dummy node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode firstptr = dummy;
        ListNode secondptr = dummy;

        // Move second pointer n steps ahead
        for (int i = 0; i < n; i++) {
            secondptr = secondptr.next;
        }

        // Move both pointers until second reaches last node
        while (secondptr.next != null) {
            firstptr = firstptr.next;
            secondptr = secondptr.next;
        }

        // Remove the Nth node
        firstptr.next = firstptr.next.next;

        // Return new head
        return dummy.next;
    }

    // Print linked list
    static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Create linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        System.out.println("Original List:");
        printList(head);

        head = removeNthFromEnd(head, n);

        System.out.println("After removing " + n + "th node from end:");
        printList(head);
    }
}
