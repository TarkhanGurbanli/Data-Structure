package LinkedListCode.SinglyLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int length;

    public SinglyLinkedList(){
        head = null;
        tail = null;
        length = 0;
    }

    public SinglyLinkedList(int data){
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
            head = newNode;
        }
        length++;
    }

    // remove method
    public Node remove(){
        Node temp = head;
        Node second = head;

        if(length == 0){
            return null;
        }

        if(length == 1){
            head = null;
            tail = null;
        }

        while (temp.next != null){
            second = temp;
            temp = temp.next;
        }
        tail = second;
        tail.next = null;
        length--;
        return temp;
    }

    // remove first node method
    public Node removeFirst(){
        Node temp = head;

        if(length == 0){
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
        }else{
            head = head.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node remove(int index)
    {
        if (index >= 0 && index < length)
        {
            if (index == 1)
            {
                return removeFirst();
            }
            if (index == length - 1)
            {
                return remove();
            }
            Node temp = get(index - 1);
            Node delete = get(index);
            temp.next = delete.next;
            delete.next = null;
            length--;
            return delete;
        }
        else
        {
            System.out.println("Your index parameter is invalid");
            return null;
        }
    }


    // get node method
    public Node get(int index){
        if(index >= 0 && index <= length){
            Node temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp;
        }else {
            return null;
        }
    }

    // set node method
    public void set(int index, int data){
        Node temp = get(index);
        if(temp != null){
            temp.data = data;
        }
    }

    // insert method
    public boolean add(int index, int data){
        if(index < 0 || index > length){
            return false;
        }

        if(index == 0){
            addFirst(data);
            return true;
        } else if (index == length) {
            add(data);
            return true;
        }else{
            Node newNode = new Node(data);
            Node temp = get(index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        }
    }

    // check cycle method
    public boolean hasCycle(Node head){
        if(head == null || head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    // Remove cycle method
    public void removeCycle(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node slow = head;
        Node fast = head;

        // Check if the linked list has a cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // If no cycle is found, return
        if (fast == null || fast.next == null) {
            return;
        }

        // Find the start of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Find the node before the start of the cycle and remove the cycle
        Node prev = fast;
        while (prev.next != slow) {
            prev = prev.next;
        }
        prev.next = null; // Remove the cycle
    }

    // reverse method
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        tail = head;  // Set the new tail to the current head

        while (current != null) {
            next = current.next; // Store the next node
            current.next = previous; // Reverse the current node's pointer

            // Move one step forward
            previous = current;
            current = next;
        }
        head = previous; // Set the new head
    }



    // print all singly linked list method
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

    // get Head Node method
    public Node getHead(){
        return head;
    }
}
