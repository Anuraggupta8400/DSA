public class Main {

    // Doubly Linked List
    static class doublylinkedlist {

        // Node
        static class Node {
            int data;
            Node pre;
            Node next;

            Node(int data) {
                this.data = data;
                this.pre = null;
                this.next = null;
            }
        }

        Node head;
        Node tail;
        int size;

        // Constructor
        doublylinkedlist() {
            head = null;
            tail = null;
            size = 0;
        }

        // Insert at Head
        public void insertathead(int data) {

            Node newnode = new Node(data);

            if (head == null) {
                head = newnode;
                tail = newnode;
            } 
            else {
                newnode.next = head;
                head.pre = newnode;
                head = newnode;
            }

            size++;
        }

        // Insert at Tail
        public void insertattail(int data) {

            Node newnode = new Node(data);

            if (head == null) {
                head = newnode;
                tail = newnode;
            } 
            else {
                newnode.pre = tail;
                tail.next = newnode;
                tail = newnode;
            }

            size++;
        }

        // Insert at Position
        public void insertatposition(int position, int data) {

            if (position < 1 || position > size + 1) {
                System.out.println("Invalid Position");
                return;
            }

            if (position == 1) {
                insertathead(data);
                return;
            }

            if (position == size + 1) {
                insertattail(data);
                return;
            }

            Node temp = head;

            for (int i = 1; i <= position - 2; i++) {
                temp = temp.next;
            }

            Node prenode = temp;
            Node nextnode = prenode.next;
            Node currnode = new Node(data);

            currnode.pre = prenode;
            currnode.next = nextnode;

            prenode.next = currnode;
            nextnode.pre = currnode;

            size++;
        }

        // Print Forward
        public void printlist() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }

            System.out.println("NULL");
        }

        // Print Reverse
        public void printreverse() {

            Node temp = tail;

            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.pre;
            }

            System.out.println("NULL");
        }

        // Print Size
        public void getsize() {
            System.out.println("Size = " + size);
        }
    }


    // MAIN METHOD
    public static void main(String[] args) {

        // Create object
        doublylinkedlist mylist = new doublylinkedlist();

        // Insert at Head
        mylist.insertathead(10);
        mylist.insertathead(20);
        mylist.insertathead(30);

        // Insert at Tail
        mylist.insertattail(40);
        mylist.insertattail(50);

        // Insert at Position
        mylist.insertatposition(3, 25);

        // Print Forward
        System.out.println("Forward List:");
        mylist.printlist();

        // Print Reverse
        System.out.println("Reverse List:");
        mylist.printreverse();

        // Print Size
        mylist.getsize();
    }
}