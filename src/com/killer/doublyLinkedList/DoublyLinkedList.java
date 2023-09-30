package com.killer.doublyLinkedList;

public class DoublyLinkedList {
    private class Node{
        private Node prev,next;
        private int value;
        private Node(){}

        private Node(int value){
            this.value=value;
        }
    }

    private  Node head;
    private  Node last;

    public void removeFirst(){
        Node node = new Node();
        if(last==null || head==null){
            head=last=null;
        }else {
            node = head.next;
            head = node;
            head.prev = null;
        }
    }

    public void removeLast(){
        Node node = new Node();
        if(last==null){

        }else
        if(head==null){
            head=last=null;
        }else {
            node = last.prev;
            last = node;
            last.next = null;
        }
    }

    public void removeAtIndex(int index){
        Node node = new Node();
        if(index==0){
            head=last=null;
        }else {
            int cnt=0;
            Node current = head;
            while (cnt<index-1){
                current = current.next;
                cnt++;
            }
            node = current.next;
            current.next = node.next;
            node.prev = current.prev;
        }
    }

    public void addAtIndex(int index,int data){
        Node node = new Node(data);
        if(head==null){
            head=last=node;
        }else{
            int cnt=0;
            Node current = head;
            while(cnt<index-1){
                current= current.next;
                cnt++;
            }
            node.next = current.next;
            current.next = node;
            node.prev = current;
        }
    }

    public void addStart(int data){
        Node node = new Node(data);
        if(head==null)
            head=last=node;
        else {
            node.next = head;
            head = node;
            head.prev = null;
        }
    }

    public void addLast(int data){
        Node node = new Node(data);
        if(head==null){
            head=last=node;
        }else {
            last.next = node;
            node.prev = last;
            last = node;
            node.next = null;

        }
    }

    public void show(){
        Node node = head;
        while (node!=null){
            System.out.print(node.value+" ");
            node = node.next;
        }
    }
}
