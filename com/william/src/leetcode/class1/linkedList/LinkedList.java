package com.william.src.leetcode.class1.linkedList;

public class LinkedList {

    public static void main(String[] args) {
        MyLinkedList myLinkedList1 = new MyLinkedList();
        Node node1 = new Node(null, null, "node 1");
        myLinkedList1.head = node1;

        Node node2 = new Node(null, null, "node 2");
        node1.nextNode = node2;
        node2.previousNode = node1;

        Node node3 = new Node(null, null, "node 3");
        node2.nextNode = node3;
        node3.previousNode = node2;
        myLinkedList1.tail = node3;

        System.out.println("Forward Traversal:");
        Node n = myLinkedList1.head;
        while (n != null) {
            System.out.println(n.data);
            n = n.nextNode;
        }

        System.out.println("Backward Traversal:");
        Node n2 = myLinkedList1.tail;
        while (n2 != null) {
            System.out.println(n2.data);
            n2 = n2.previousNode;
        }
    }
}
