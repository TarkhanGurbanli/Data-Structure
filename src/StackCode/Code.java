package StackCode;

import java.util.Stack;

public class Code {
    public static void main(String[] args) {
//        String s1 = "()";
//        String s2 = "()[]{}";
//        String s3 = "(]";
//        String s4 = "([)]";
//        String s5 = "{[]}";

//        System.out.println(isValid(s1)); // true
//        System.out.println(isValid(s2)); // true
//        System.out.println(isValid(s3)); // false
//        System.out.println(isValid(s4)); // false
//        System.out.println(isValid(s5)); // true


        Stack<Integer> st = new Stack<>();
//        st.push(4);
//        st.push(23);
//        st.push(543);
//        st.push(1);
//        st.push(343);
//        System.out.println(getMin(st));
//        System.out.println("Min: " + Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE < 1);

        String s1 = "(()";
        String s2 = ")()())";
        String s3 = "";
        String s4 = "((()))";

        System.out.println(longestValidParentheses(s1)); // 2
        System.out.println(longestValidParentheses(s2)); // 4
        System.out.println(longestValidParentheses(s3)); // 0
        System.out.println(longestValidParentheses(s4)); // 6
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValidV2(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((c == ')' && top != '(')
                || (c == '}' && top != '{')
                || c == ']' && top != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static int[] findNextSmallerElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }

            stack.push(nums[i]);
        }

        return result;
    }

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    stack.pop();
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static int getMin(Stack<Integer> stack){
        int min = Integer.MAX_VALUE;
        for(Integer num : stack){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}
