
public class CircularLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    private Node head = null;
    private Node tail = null;

    public void add(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }

    public void display() {
        Node current = head;
        if (head != null) {
            do {
                System.out.print(current.data + "");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public void delete(int data){
        if(head==null){
            System.out.println("Circular LinkedList empty");
            return;
        }
        Node current=head;
        Node previous=null;
        // Check if the node to be deleted is the head node
        if (head.data == data) {
            if (head == tail) { // Only one node in the list
                head = null;
                tail = null;
            } else { // More than one node in the list
                head = head.next;
                tail.next = head;
            }
            return;
        }

        // Traverse the list to find the node to be deleted
        do {
            previous = current;
            current = current.next;
        } while (current != head && current.data != data);

        // If node with the given data is found
        if (current.data == data) {
            if (current == tail) { // If it's the tail node
                tail = previous;
            }
            previous.next = current.next;
        } else {
            System.out.println("Node with data " + data + " not found in the list.");
        }
    }

    public static void main(String[] args) {

    }
}
