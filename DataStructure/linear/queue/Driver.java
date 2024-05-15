package DataStructure.linear.queue;

public class Driver {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println( queue.isEmpty());
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        System.out.println( queue.isEmpty());

        while (!queue.isEmpty()){
            System.out.print(queue.peek() + " ");
            System.out.print(queue.poll() + " ");
        }
        System.out.println("\n" +  queue.isEmpty());

    }
}
