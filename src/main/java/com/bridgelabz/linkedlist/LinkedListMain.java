package com.bridgelabz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList1 = new LinkedList();
        linkedList1.push(70);
        linkedList1.push(56);
        linkedList1.display();
        boolean isInserted = linkedList1.insertAfter(30, 56);
        if (isInserted) {
            System.out.println("Element inserted successfully!!");
        } else {
            System.out.println("Element not inserted!!");
        }
        linkedList1.display();
    }
}
