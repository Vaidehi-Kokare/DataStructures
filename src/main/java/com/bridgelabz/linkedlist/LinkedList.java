package com.bridgelabz.linkedlist;
class Node <T> {
    T data;
    Node<T> next;

     Node(T data) {
        this.data = data;
    }
}
public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
    }

    public void push(T data) {
        Node<T> newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }
    public void display() {
        for(Node<T> temp = this.head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " -> ");
        }

        System.out.println();
    }
}
