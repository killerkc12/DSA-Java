package com.killer.stack;

import java.util.Arrays;

public class Stack {

    int top;
    int a[] = new int[5];

    public void push(int data){
        a[top] = data;
        top++;
    }

    public void pop(){
        top--;
        a[top] = 0;
//        top--;
    }

    public void show(){
        System.out.println(Arrays.toString(a));
    }
}
