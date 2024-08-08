package LinkedListCode;

import java.util.LinkedList;

public class Code {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
//        LinkedList<Integer> list2 =  reverseList(list);
//        for (Integer i : list2) {
//            System.out.println(i);
//        }

//        int result = findMidEl(list);
//        System.out.println(result);

        boolean check = checkPalindrome(list);
        System.out.println(check);
    }

    // LinkedList reverse method
    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.addLast(list.get(i));
        }
        return reverseList;
    }

    // LinkedList find middle element method
    public static int findMidEl(LinkedList<Integer> list){
       int mid = list.size() / 2;
       return list.get(mid);
    }

    // check palindrome method
    public static boolean checkPalindrome(LinkedList<Integer> list) {
        LinkedList<Integer> reverseList = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        return reverseList.equals(list);
    }

    public static Integer getIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        int length1 = list1.size();
        int length2 = list2.size();

        while (length1 > length2) {
            list1.removeFirst();
            length1--;
        }
        while (length2 > length1) {
            list2.removeFirst();
            length2--;
        }

        for (int i = 0; i < length1; i++) {
            if (list1.get(i).equals(list2.get(i))) {
                return list1.get(i);
            }
        }
        return null;
    }
}
