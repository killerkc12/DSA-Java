package com.killer.doublyLinkedList;

public class DoublyMain {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addStart(10);
        list.addStart(20);
        list.addStart(30);

        list.addLast(40);
        list.addLast(50);

        list.addStart(60);
        list.addStart(70);

        list.addAtIndex(2,100);

        list.show();

        list.removeFirst();
        System.out.println();

        list.show();

        list.removeLast();
        System.out.println();

        list.show();

        list.removeAtIndex(3);
        System.out.println();

        list.show();
    }
}
