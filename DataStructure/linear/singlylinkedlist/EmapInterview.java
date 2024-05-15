package DataStructure.linear.singlylinkedlist;

/**
     * Input: head = Node(1)

     1->2->3->4->5
     k = 2
     4->5->1->2->3
     */

    public class EmapInterview {
        static class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
            }
        }

        static Node newHead(Node head, int k) {
            int size=1;
            Node first=head;
            Node last=null;
            while(head.next!=null)
            {
                head=head.next;
                size++;
                if(head.next==null)
                {
                    last=head;
                }
            }
            Node temp=first;
            System.out.println("size : "+size);
            for(int i=1;i<size-k;i++)
            {
                temp=temp.next;
            }
            System.out.println(temp.val);
            head=temp.next;
            temp.next=null;
            last.next=first;
            return head;
        }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);

            printNodes(head);
            Node newHead = newHead(head, 3);
            printNodes(newHead);

            System.out.println("Hello!!");
        }

        static void printNodes(Node head) {
            System.out.println("Nodes: ");
            while(head != null) {
                System.out.print(head.val + "->");
                head = head.next;
            }
            System.out.println();
        }
    }
