class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList{
    Node head;
    public SinglyLinkedList(){

    }
    //insert at the beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            
        
    }
    //insert at the end
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    //Delete at the beginning
    public void deleteAtBeginning(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class LinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtBeginning(10);
        sll.insertAtBeginning(20);
        sll.insertAtBeginning(30);
        sll.insertAtBeginning(40);
        sll.insertAtEnd(50);
        System.out.println("Linked List:");
        sll.display();

        sll.deleteAtBeginning();
        System.out.println("after deleting at the beginning:");
        sll.display();
    }
}