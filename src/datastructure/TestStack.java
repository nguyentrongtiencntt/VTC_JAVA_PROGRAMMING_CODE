package datastructure;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack();
        String s1 ="Minh Quân";
        String s2 ="Quang Minh";
        st.push(s1);
        st.push(s2);
        System.out.println(st.pop());
        System.out.println(st.pop());
    }

}
