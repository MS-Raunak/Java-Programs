package DataStructure.linear.stack;

public class Driver {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.isEmpty());



        while (!stack.isEmpty()){
            System.out.print("peeked data:" + stack.peek() + " ");
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\n" + stack.isEmpty());



    }
}
