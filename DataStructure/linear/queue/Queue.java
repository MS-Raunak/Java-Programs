package DataStructure.linear.queue;

public class Queue {
    Node first;
    Node last;
    int count=0;

    public boolean isEmpty(){
        return first==null;
    }
    //first->10->20->30->40
    public void push(Object data){
        Node node = new Node(data);
        if (isEmpty()) {
            first=last=node;
            count++;
        }
        last.next = node;
        last = node;
        count++;
    }

    //to get last added element
    public Object peek(){
        if (isEmpty()) return null;
        return first.data;
    }

    //to remove first added element
    public Object poll(){
        if (isEmpty()) return null;

        Object data = first.data;
        first = first.next;
        count--;
        return data;
    }
}
