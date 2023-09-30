package com.killer.circularLinkedList;

public class CircularMain {
    public static void main(String[] args) {
        CircularLikedList list = new CircularLikedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.addFirst(50);
        list.addFirst(60);
        list.addFirst(70);
        list.addFirst(80);

        list.addLast(90);

        list.show();
    }
}
