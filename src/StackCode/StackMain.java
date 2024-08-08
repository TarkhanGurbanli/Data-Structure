package StackCode;

public class StackMain {
    public static void main(String[] args) {
        StackExample st = new StackExample(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println("Deleted: " + st.pop().data);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println("Empty: " + st.isEmpty());
        st.printStack();
        st.printTop();
    }
}
