package com.killer.stack;

public class StackMain {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();

        stack.show();

        stack.push(50);

        stack.show();

        stack.pop();

        stack.show();
    }
}
