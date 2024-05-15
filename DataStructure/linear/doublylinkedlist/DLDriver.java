package DataStructure.linear.doublylinkedlist;

public class DLDriver {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.display(list.head);

        //list.addFirst(100);
        //list.addFirst(200);
        //list.display(list.head);

        //list.addAt(100, 2);
        //list.display(list.head);

        //System.out.println(list.remove() + " removed");
        //System.out.println(list.remove() + " removed");
        //list.display(list.head);

        //System.out.println(list.removeFirst() + " removed");
        //System.out.println(list.removeFirst() + " removed");
        //list.display(list.head);
        //System.out.println(list.size());

        //System.out.println(list.removeAt(1) + " removed");
        //System.out.println(list.removeAt(list.size()) + " removed");
        //System.out.println(list.removeAt(0) + " removed");
        //System.out.println(list.removeAt(list.size()+1) + " removed");
        System.out.println(list.removeAt(2) + " removed");
        list.display(list.head);
    }
}
