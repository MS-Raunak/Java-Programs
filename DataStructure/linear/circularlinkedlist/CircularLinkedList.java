package DataStructure.linear.circularlinkedlist;

public class CircularLinkedList {
    Node head;
    Node tail;
    int count=0;

    //Adding data at head
    public void add(Object data) {
        Node node = new Node(data);

        if (head==null) {
            head=tail=node;
        }
        else {
            tail.next = node;
            tail=node;
            tail.next=head;
        }
        count++;
    }

    //Adding data at tail
    public void addFirst(Object data) {
        if (head==null){
            add(data);
            return;
        }
        Node node = new Node(data);
        node.next = head;
        head=node;
        tail.next=head;
        count++;
    }

    //Adding data on specified index
    public void addAt(Object data, int index) {
        if (head==null || index==count+1){
            add(data);
            return;
        }
        else if (index==1){
            addFirst(data);
            return;
        }

        Node node = new Node(data);
        Node temp = head;

        for (int i=1; i<index-1; i++) {
            temp=temp.next;
        }

        node.next = temp.next;
        temp.next=node;
        count++;
    }

    //Remove data from tail
    public void remove() {
        if (head==null){
            System.out.println("No data found to delete...");
            return;
        }

        Node temp = head;
        for (int i=1; i<count-1; i++) {
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
        count--;
    }

    //Remove from head
    public void removeFirst() {
        if (head==null){
            System.out.println("No data found to delete...");
            return;
        }
        head=head.next;
        tail.next = head;
        count--;
    }

    //Remove from given index
    public void removeAt(int index) {
        if (index < 1 || index > count) {
            System.out.println("Index out of bound");
            return;
        }
        if (index==1){
            removeFirst();
            return;
        }
        else if (index==count){
            remove();
            return;
        }

        Node temp = head;
        for (int i=1; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        count--;
    }

    //displaying data
    public void display(Node head) {
        if (head==null){
            System.out.println("No data found");
            return;
        }

        Node temp = head;

        while (temp.next.data!=head.data) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(tail.data + "->----");

    }
}
