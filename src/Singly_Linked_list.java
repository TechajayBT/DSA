class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data; //initialize the variables
        this.next=null;
    }
}
class SinglyLinkedList{
    private Node head;

    //Constructor to initialize an empty list
    public SinglyLinkedList(){
        head = null;
    }

    public void InsertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        } else{
            Node current=head;
            while(current.next != null){
                current = current.next;
            }
            current.next=newNode;
        }
    }

    public void InsertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
    }


    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node current=head;
        while(current != null){
            System.out.print(current.data + "->");
            current=current.next;
        }
        System.out.print("Null");
    }

    public boolean search(int data){
        Node current=head;
        while(current!=null){
            if(current.data==data){
                return true;
            }
            current=current.next;
        }

        return false;
    }

    public int size(){
        int size=0;
        Node current=head;
        while(current != null){
            size ++;
            current=current.next;
        }
    return size;
    }

    public void delete(int data){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }

        Node current=head;
        while(current.next!=null && current.next.data!=data){
            current=current.next;
        }
        if(current.next==null){
            System.out.println("Value not found in list");
        }
        else{

        }
    }

}
public class Singly_Linked_list  {
    public static void main(String[] args) {
        try{
            SinglyLinkedList list=new SinglyLinkedList();
            list.InsertAtEnd(10);
            list.InsertAtEnd(40);
            list.InsertAtBeginning(20);
            System.out.println("Initial list");
            list.display();
            System.out.println("List size: "+ list.size());
            System.out.println();
            System.out.println(list.search(20));
            list.delete(40);
            System.out.println("Initial list");
            list.display();
    }catch(Exception e){
            e.printStackTrace();
        }
    }
}
