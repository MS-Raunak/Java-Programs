package assesment.test1.section4;

public class LinkedList {
    Node head;
    Node tail;
    int count=0;


    //Display Node
    public void display(Node head) {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    //Size of linked-list
    public int size() {
        return count;
    }

    //Add element
    public void add(int data) {
        Node node = new Node(data);

        if (head==null) {
            head=tail=node;
        }
        else {
            tail.next = node;
            tail = tail.next;
        }
        count++;
    }

    //Add First
    public void addFirst(int data) {
        Node node = new Node(data);
        if (size()==0){
            add(data);
            return;
        }
        else {
            node.next=head;
            head=node;
            count++;
        }
    }

    //Add at given index
    public void addAt(int data, int index) {
        if (index==size()+1){
            add(data);
            return;
        }
        else if (index==0){
            addFirst(data);
            return;
        }

        else if (index < 0 || index > size()+2) {
            System.out.println("Please enter valid index..");
            return;
        }
        else {
            Node node = new Node(data);
            Node temp = head;
            for (int i=1; i<index; i++) {
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next = node;
            count++;
        }
    }

    //Get specified data
    public int getData(int index) {
        Node temp = head;

        if (index>=0 && index<=size()){
            int count=0;
            while (temp!=null){
                if (index==count) return temp.data;
                temp=temp.next;
                count++;

            }
        }

        return -1;
    }

    //Remove data
    public int remove() {
        int val = tail.data;
       if(size()==0){
           head=tail=null;
           return -1;
       }
       else {
           Node temp = head;
          for (int i=1; i<size()-1; i++) {
              temp = temp.next;
          }
          temp.next=null;
           tail=temp;
           count--;
       }
       return val;
    }

    //String Representation

    @Override
    public String toString() {
        String res="";
        Node temp = head;
        while (temp!=null){
            res=res + temp.data+" ";
            temp=temp.next;
        }
        return res.trim();
    }
}

class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("Initial Size: " + list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        //System.out.println("Current Size: " + list.size());
        list.display(list.head);
        list.addFirst(40);
        System.out.println("Current Size: " + list.size());
        list.display(list.head);
        //System.out.println(list.getData(3));
        //System.out.println("Deleted val: " + list.remove());
        //System.out.println("Deleted val: " + list.remove());
        //System.out.println(list.toString());
        list.addAt(100,6);
        list.display(list.head);
    }
}