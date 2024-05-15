package DataStructure.linear.doublylinkedlist;

public class Node {
    Node next;
    Node prev;
    Object data;


    public Node() {
    }

    public Node(Node next, Node prev, Object data) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }

    public Node(Object data) {
        this.data = data;
    }
}
