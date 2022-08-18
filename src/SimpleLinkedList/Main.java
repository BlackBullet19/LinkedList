package SimpleLinkedList;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.addNode(10);
        linkedList.addNode(5);
        linkedList.addNode(15);
        linkedList.addNode(33);
        linkedList.addNode(3);

        linkedList.print(linkedList.getFirst());
        Node first = linkedList.reverse(linkedList.getFirst());
        linkedList.print(first);
    }
}
