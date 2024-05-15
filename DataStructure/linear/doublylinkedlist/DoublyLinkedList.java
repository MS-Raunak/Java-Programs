package DataStructure.linear.doublylinkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int count=0;

    //checking list size
    public int size() {
        return count;
    }

    //checking whether the list is empty or not
    public boolean isEmpty() {
        return count==0;
    }

    //Adding data at ending
    public void add(Object data) {
        Node node = new Node(data);

        if (head==null){
            head=tail=node;
        }

        tail.next = node;
        node.prev = tail;
        tail=node;
        count++;
    }

    //Adding data at beginning
    public void addFirst(Object data) {
        if (head==null){
            add(data);
            return;
        }
        Node node = new Node(data);
        head.prev = node;
        node.next=head;
        head=node;
        count++;

    }

    //Adding data at given index
    public void addAt(Object data, int index) {
        if (index<1 || index > size()+1){
            System.out.println("Invalid index");
            return;
        }

        if (index == 1){
            addFirst(data);
            return;
        }
       else if (index==size()+1){
            add(data);
            return;
        }
       Node node = new Node(data);
       Node temp = head;

       for (int i=1; i<index-1; i++) {
           temp=temp.next;
       }

       node.next = temp.next;
       node.prev = temp;
       temp.next = node;
       count++;
    }

    //Removing data from ending
    public Object remove() {
        if (head==null) return null;

        Object res = tail.data;

        tail = tail.prev;
        tail.next=null;
        count--;

        return res;
    }

    //Removing data from beginning
    public Object removeFirst() {
        if (head==null) return null;

        Object res = head.data;
        head=head.next;
        head.prev=null;
        count--;

        return res;
    }

    //Removing data from given index
    public Object removeAt(int index) {
        if (head==null || index < 1 || index > size()) return null;

        if (index==1) return removeFirst();
        else if (index==size()) return  remove();

        Node temp = head;

        for (int i=1; i<index-1; i++) {
            temp=temp.next;
        }
        Object res = temp.next.data;

        temp.next = temp.next.next;
        temp.next.prev = temp;
        count--;

        return res;
    }


    //Displaying data
    public void display(Node head) {
        if (head==null){
            System.out.println(head);
            return;
        }

        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
}
