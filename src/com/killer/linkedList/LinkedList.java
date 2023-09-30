package com.killer.linkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;
        public Node(){}

        public Node(int value){
            this.value=value;
        }
    }
    private Node first;
    private Node last;

    public void addEnd(int data){
        Node node = new Node(data);

        if(first==null)
            first=last=node;
        else {
            last.next = node;
            last = node;
        }
    }

    public void addStart(int data){
        Node node = new Node(data);
        if(first==null)
            first=last=node;
        else{
            node.next = first;
            first = node;

        }
    }

    public void show(){
        Node node = new Node();
        node = first;
        while (node!=null){
            System.out.println(node.value);
            node = node.next;
        }

    }

    public void removeFirst(){
        if(first==null)
            throw new NoSuchElementException();
        else if(first==last)
            first=last=null;
        else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
    }

    public void removeLast(){
        if(first==null)
            throw new NoSuchElementException();
        else if(first==last)
            first=last=null;
        else {
            Node node = null;
            Node current = first;
            while (current!=null){
                if(current.next==last){
                    last = current ;
                    last.next = null;
                    break;
                }
                current = current.next;
            }
        }
    }

    public void addMiddle(int index,int data){
        Node node = new Node(data);
        if(first==null){
            first=last=node;
        }else {
            int cnt=0;
            Node current = first;
            while(cnt<index-1){
                cnt++;
                current = current.next;
            }
            node.next=current.next;
            current.next = node;
        }
    }

    public void deleteMiddle(int index){
        Node node = new Node();
        Node temp = null;
        if(first==null){
            first=last=null;
        }else {
            int cnt=0;
            Node current = first;
            while(cnt<index-1){
                cnt++;
                current = current.next;
            }
            temp = current.next;
            current.next = temp.next;
        }
    }


}
