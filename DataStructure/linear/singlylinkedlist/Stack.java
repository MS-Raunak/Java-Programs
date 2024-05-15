package DataStructure.linear.singlylinkedlist;

public class Stack {
    int data;
    Node head;
    int count=0;

    //checking stack is empty or not
    public boolean isEmpty() {
        return count==0;
    }

    //finding size of stack
    public int size() {
        return count;
    }

    //insert data
    public void push(Object data) {
        Node node = new Node(data);
        if (head==null) head=node;
        else {
            node.next=head;
            head=node;
        }
        count++;
    }

    //remove data
    public Object pop() {
        if (isEmpty()) return -1;
        Object data = head.data;
        head=head.next;
        count--;
        return data;
    }

    //get last data
    public Object peek(){
        if (isEmpty()) return -1;
        return head.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Initial size: " + stack.size());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Current size: " + stack.size());

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
            if (stack.isEmpty()){
                break;
//                System.out.println("\nNo more elements found");
            }
        }

        System.out.println("\nCurrent size: " + stack.size());
    }

}
