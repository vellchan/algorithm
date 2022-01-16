package javaAlgorithms;

import java.util.ArrayList;

public class StackTest<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public static void main(String[] args) {
        StackTest<Integer> st = new StackTest<Integer>();
        st.push(1);
        st.push(3);
        st.push(2);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }

    private T pop() {
        if (stack.isEmpty()){
            return null;
        }
        return stack.remove(0);
    }

    private void push(T i) {
        stack.add(0, i);
    }
}
