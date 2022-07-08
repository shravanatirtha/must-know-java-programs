package LinkedList;

public class ReverseRecursive {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        a.printList();
        Node head = reverseList(a);
        head.printList();

    }

    public static Node reverseList(Node head) {
        if (head.next == null)
            return head;
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    static class Node {
        public Node next;
        public int data;

        public Node(int data) {
            this.data = data;
        }

        public void printList() {
            Node head = this;
            while (head != null) {
                System.out.print(head.data + "->");
                head = head.next;
            }
            System.out.println();
        }

    }

}
