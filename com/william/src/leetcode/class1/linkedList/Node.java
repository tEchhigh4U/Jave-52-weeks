package com.william.src.leetcode.class1.linkedList;

public class Node {
    Node nextNode;
    Node previousNode;
    String data;

    public Node(Node nextNode, Node previousNode, String data) {
        this.nextNode = nextNode;
        this.previousNode = previousNode;
        this.data = data;
    }
}
