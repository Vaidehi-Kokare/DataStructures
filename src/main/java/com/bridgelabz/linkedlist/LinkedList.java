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
    public void append(T data) {
        Node<T> newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }

    }
    public Node<T> search(T searchData) {
        for(Node<T> temp = this.head; temp != null; temp = temp.next) {
            if (temp.data.equals(searchData)) {
                return temp;
            }
        }

        return null;
    }

    public boolean insertAfter(T insertData, T searchData) {
        Node<T> searchedData = this.search(searchData);
        if (searchedData != null) {
            Node<T> newNode = new Node(insertData);
            Node<T> nextNode = searchedData.next;
            searchedData.next = newNode;
            newNode.next = nextNode;
            return true;
        } else {
            return false;
        }
    }
    public T pop() {
        T popData = this.head.data;
        this.head = this.head.next;
        return popData;
    }
}
