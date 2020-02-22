package com.company;

public class LinkedList {
    Node head;

    public void printList(){
        Node n = head;
        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void push(int newData){
        Node newnode = new Node(newData);
        newnode.next = head;
        head = newnode;
    }

    public void insertAfter(Node prevnode, int newData){
        if(prevnode == null){
            System.out.println("Previous node cannot be null");
            return;
        }

        Node newnode = new Node(newData);
        newnode.next = prevnode.next;
        prevnode.next = newnode;
    }

    public void addToTheEnd(int newData) {
        Node newnode = new Node(newData);

        if (head == null) {
            head = new Node(newData);
            return;
        }

        newnode.next = null;
        Node last = head;

        while (last.next != null) last = last.next;

        last.next = newnode;
        return;
    }

    void deleteNode(int index){
        Node temp = head;
        Node prev = null;

        if(temp != null && temp.data == index){
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != index){
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;

        prev.next = temp.next;
    }
}
