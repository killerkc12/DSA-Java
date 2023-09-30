package com.killer.queue;

import java.util.Arrays;

public class Queue {
    int[] a = new int[10];
    int front,rear;
    public Queue(){
        front=rear;
    }

    public void enQueue(int data){
        a[rear] = data;
        rear++;
    }
    public void deQueue(){
        while (front!=rear){
            a[front]=a[front+1];
            front++;
        }
        rear--;
        front=0;
    }
    public void show(){
        System.out.println(Arrays.toString(a));
        System.out.println(front);
        System.out.println(rear);
    }
}
