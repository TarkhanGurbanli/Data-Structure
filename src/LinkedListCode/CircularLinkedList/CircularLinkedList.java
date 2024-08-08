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

    // add first method
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else {
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }
        length++;
    }

    // remove last method
    public Node remove(){
        Node second = head;
        Node temp = head;

        if(length == 0){
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
            length = 0;
            return temp;
        }else{
            while(temp.next != head){
                second = temp;
                temp = temp.next;
            }
            second.next = head;
            tail = second;
            temp.next = null;
        }
        length--;
        return temp;
    }

    // remove first method
    public Node removeFirst(){
        Node temp = head;
        if(length == 0){
            return null;
        }else if(length == 1){
            head = null;
            tail = null;
            length = 0;
            return temp;
        }else{
            tail.next = temp.next;
            head = temp.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
