package com.killer.linkedList;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addStart(10);
        list.addEnd(20);
        list.addEnd(40);
        list.addEnd(50);


//        list.removeFirst();
//        list.removeLast();

//        list.addMiddle(1,60);

        list.deleteMiddle(1);

        list.show();

    }



}
