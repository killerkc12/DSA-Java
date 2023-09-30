package com.killer.circularLinkedList;

public class CircularLikedList {
    private class Node{
        private int value;
        private Node next;
        private Node prev;
        public Node(){}
        public Node(int value){this.value=value;}
    }
    private Node head;
    private Node tail;

    public void  addLast(int data){
        Node node = new Node(data);
        if(head==null){
            head= tail = node;
            node.next = head;
        }else {

            tail.next = node;
//            node.prev = tail;
            tail = node;
            tail.next = head;
        }
    }

    public void addFirst(int data){
        Node node = new Node(data);
        if (head==null){
            head=tail=node;
            node.next = head;
        }else {
            node.next = head;
            head = node;
            tail.next = head;
        }
    }

    public  void insert(int data){
        Node node = new Node(data);
        if (head==null)
        {
            head=tail=node;
            node.next = head;
        }else{
            tail.next=node;
            tail= node;
            tail.next = head;
        }

    }

    public void show(){
        int cnt=0;
        Node current = head;
        do{
            System.out.print(current.value+" ");
            current = current.next;
        }while (current.next!=head);
    }

}
