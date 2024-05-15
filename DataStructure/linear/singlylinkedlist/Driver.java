package DataStructure.linear.singlylinkedlist;

public class Driver {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.display(list.head);
        //System.out.println(list.size());


        //list.addFirst(900);
        //list.addAt(1111, 3);
        //list.display(list.head);
        //System.out.println(list.size());


        //System.out.println(list.remove());
        //System.out.println(list.removeFirst());

        //System.out.println(list.removeAt(3));
        //System.out.println(list.size());

        //System.out.println(list.get());
        //System.out.println(list.getFirst());
        //System.out.println(list.getAt(2));

        //list.clear();
        //list.display(list.head);

        //list.reverse(list.head);
        list.reverseWithoutRec(list.head);



    }
}
