package SimpleLinkedList;

public class SinglyLinkedList {

    private Node first = null;
    private Node last = null;

    protected void addNode(int value) {

        Node node = new Node(value);

        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    protected void print(Node first) {

        Node current = first;

        if (current == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public Node getFirst() {
        return first;
    }

    protected Node reverse(Node first) {

        if (first == null || first.next == null) {
            return first;
        }
        Node rest = reverse(first.next);
        first.next.next = first;

        first.next = null;

        return rest;
    }
}
