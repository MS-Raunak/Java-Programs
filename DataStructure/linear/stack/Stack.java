package DataStructure.linear.stack;

public class Stack {
    Node top;
    int count=0;

    public boolean isEmpty(){
        return count==0;
    }

    // top->40->30->20->10
    public void push(Object data){
        Node node = new Node(data);
        if (top==null){
            top=node;
            count++;
            return;
        }
        node.next = top;
        top = node;
        count++;
    }

    public Object peek(){
        if (isEmpty()) return null;
        return top.data;
    }

    public Object pop(){
        if (isEmpty()) return null;
        Object data = top.data;
        top = top.next;
        count--;
        return data;
    }
}
