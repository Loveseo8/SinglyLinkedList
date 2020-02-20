package com.company;

public class Main {

    public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.push(6);
	list.push(5);
	list.push(4);
	list.push(3);
	list.push(2);
	list.push(1);

	list.deleteNode(5);

	list.printList();
    }
}
