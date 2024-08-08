package StackCode;

// LIFO : Last In First Out
public class StackExample {
    public Node top;
    public int count;

    public StackExample() {
        top = null;
        count = 0;
    }

    public StackExample(int data) {
        Node newNode = new Node(data);
        top = newNode;
        count = 1;
    }

    // add new node method
    public void push(int data) {
        Node newNode = new Node(data);
        if(count == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        count++;
    }

    // delete node method
    public Node pop() {
        Node temp = top;
        if(count == 0){
            return null;
        } else if (count == 1) {
            top = null;
            count = 0;
            return temp;
        }else{
            top = top.next;
            temp.next = null;
        }
        count--;
        return temp;
    }

    // empty method
    public boolean isEmpty(){
        return count == 0;
    }

    // print stacks method
    public void printStack(){
        Node temp = top;
        System.out.println("-------------------------");
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("-------------------------");
    }

    //print top element
    public void printTop(){
        if(top != null){
            System.out.println("Top: " + top.data);
        }
    }
}
