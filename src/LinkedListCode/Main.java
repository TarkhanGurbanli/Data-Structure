package LinkedListCode;

import LinkedListCode.DoublyLinkedList.DoublyLinkedList;
import LinkedListCode.SinglyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.addFirst(111);
//        list.remove();
//        System.out.println("Cycle: " + list.hasCycle(list.getHead()));
//        System.out.println("Index data: " + list.get(2));
//        list.removeFirst();
//        list.add(2,44);
//        list.reverse();
//        list.printList();
//        list.printHead();
//        list.printTail();
//        list.printLength();

//---------------------------------------------------------------------------------------------------------------------

        DoublyLinkedList list = new DoublyLinkedList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.addFirst(22);
        list.remove();
        list.removeFirst();
        list.printList();
        list.printHead();
        list.printTail();
        list.printLength();
    }
}
