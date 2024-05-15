package DataStructure.linear.singlylinkedlist;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int count=0;

    //size of linked list
    public int size() {
        return count;
    }

    //Adding data at end index
    public void add(Object data){
        Node node = new Node(data);
        if (head==null) {
            head=tail=node;
        }
        else {
            tail.next = node;
            tail = node;
        }
        count++;
    }

    //Adding data at first index
    public void addFirst(Object data){
        Node node = new Node(data);

        if (head==null) {
            add(data);
            return;
        }

        node.next = head;
        head=node;
        count++;
    }

    //Adding data at given index
    public void addAt(Object data, int index) {
        if (index < 1 || (index>size() && size()!=0)){
            System.out.println("Index value must be between 1 to size+1");
            return;
        }
        else if (head == null && index==1) {
            add(data);
            return;
        }
        else if (head==null && index>1){
            System.out.println("List is null and index value is more than 1");
        }
        else if (index==1){
            addFirst(data);
            return;
        }

        Node node = new Node(data);
        Node temp = head;

        for (int i=1; i<index-1; i++){
            temp=temp.next;
        }
        node.next = temp.next;
        temp.next=node;
        count++;

    }

    //Removing data from ending index
    public Object remove() {
        if (head==null){
            return null;
        }
        Object res = tail.data;

        Node temp = head;

        for (int i=1; i<size()-1; i++) {
            temp=temp.next;
        }
        temp.next = null;
        tail=temp;
        count--;

        return res;
    }

    //Removing data from beginning index
    public Object removeFirst(){
        if (head==null) return null;

        Object res = head.data;
        head=head.next;
        count--;
        return res;
    }

    //Removing data from given index
    public Object removeAt(int index) {
        if (index<1 || index > size())  return null;

        if (index==1) return removeFirst();
        else if (index==size()) return remove();

        Node temp = head;
        Object res = temp.next.data;
        for (int i=1; i<index-1; i++) {
            temp=temp.next;
        }
        count--;
        temp.next = temp.next.next;

        return res;
    }

    //Getting data from ending index
    public Object get() {
        return tail.data;
    }

    //Getting data from beginning index
    public Object getFirst(){
        return head.data;
    }

    //Getting data from given index
    public Object getAt(int index){
        if (index<1 || index>size() || head==null){
            return null;
        }
        Node temp = head;

        for (int i=1; i<index; i++){
            temp = temp.next;
        }

        return temp.data;
    }

    //Removing all the together data from list
    public void clear() {
        head=tail=null;
    }

    //Displaying data
    public void display(Node head) {
        if (head==null){
            System.out.println("No data available in the list");
            return;
        }
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Displaying data in reverse order using recursion
    public void reverse(Node head){
        if (head==null) return;
        reverse(head.next);
        System.out.print(head.data + " ");
    }

    //Displaying data in reverse order without using recursion
    public void reverseWithoutRec(Node head){
        Node current = head;
        Node prev = null;

        while (current!=null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        display(prev);
    }


}
