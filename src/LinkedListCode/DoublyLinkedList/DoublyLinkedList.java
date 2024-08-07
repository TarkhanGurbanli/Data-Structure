package LinkedListCode.DoublyLinkedList;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int length;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public DoublyLinkedList(int data){
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // add method
    public void add(int data){
        Node newNode = new Node(data);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    // add first method
    public void addFirst(int data){
        Node newNode = new Node(data);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    // remove method
    public Node remove(){
        Node temp = tail;
        if(length == 0){
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
        length--;
        return temp;
    }

    // remove first method
    public Node removeFirst(){
        Node temp = head;
        if(length == 0){
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        length--;
        return temp;
    }

    // get node method
    public Node get(int index)
    {
        Node temp = head;

        if (index < 0 || index >= length)
        {
            return null;
        }else if(index < length / 2) {
            for (int i = 0; i < index; i++)
            {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--)
            {
                temp = temp.prev;
            }
        }
        return temp;
    }

    // set method
    public void set(int index, int data)
    {
        Node temp = get(index);

        if (temp != null)
        {
            temp.data = data;
        }
    }

    public boolean insert(int index, int data)
    {
        if (index < 0 || index > length)
        {
            return false;
        }else if (index == 0) {
            addFirst(data);
            return true;
        }else if (index == length) {
            add(data);
            return false;
        }else {

            Node newNode = new Node(data);
            Node prevNode = get(index - 1);
            Node nextNode = get(index);

            newNode.prev = prevNode;
            newNode.next = nextNode;
            prevNode.next = newNode;
            nextNode.prev = newNode;
        }
        length++;
        return true;
    }

    public Node remove(int index)
    {
        Node deleteNode = null;
        if (index >= 0 && index < length)
        {
            if (index == 0)
            {
                removeFirst();
            } else if (index == length - 1) {
                remove();
            } else {
                deleteNode = get(index);
                deleteNode.next.prev = deleteNode.prev;
                deleteNode.prev.next = deleteNode.next;
                deleteNode.next = null;
                deleteNode.prev = null;
                length--;
            }
        }
        else
        {
            return null;
        }
        return deleteNode;
    }

    // print all doubly linked list method
    public void printList(){
        Node temp = head;
        System.out.println("---------------------------");
        System.out.println("Singly Linked List: ");
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("---------------------------");
    }

    // print head method
    public void printHead(){
        if(head != null){
            System.out.println("Head: " + head.data);
        }
    }

    // print tail method
    public void printTail(){
        if(tail != null){
            System.out.println("Tail: " + tail.data);
        }
    }

    // print length method
    public void printLength(){
        System.out.println("Length: " + length);
    }
}
