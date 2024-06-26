public class DLinked_list {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    private Node head,tail;
    public DLinked_list(){
        this.head=null;
        this.tail=null;
    }

    //To insert element at the last
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //To insert element at the beginning
    public void prepend(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    //To print the doubly LinkedList
    public void printList(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+ "");
            current=current.next;
        }
        System.out.println();
    }

    //To print the Reverse doubly LinkedList
    public void printListReverse(){
        Node current=tail;
        while(current!=null){
            System.out.print(current.data + "");
            current=current.prev;
        }
        System.out.println();
    }

    //To delete a element in doubly linkedlist
    public void delete(Node node){
        if(node == null) return;
        if(node.prev!=null){
            node.prev.next=node.next;
        }
        else{
            head=node.next;
        }

        if(node.next!=null){
            node.next.prev=node.prev;
        }
        else {
            tail = node.prev;
        }

        // Clear the node's links
        node.prev = null;
        node.next = null;
    }

    public Node find(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null; // Not found
    }

    public static void main(String[] args) {

    }
}
