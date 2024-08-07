package LinkedListCode.CircularLinkedList;

public class CircularLinkedList {
    public Node head;
    public Node tail;
    public int length;

    public CircularLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public CircularLinkedList(int data){
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // add method
    public void add(int data) {
        Node newNode = new Node(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        length++;
    }
}
