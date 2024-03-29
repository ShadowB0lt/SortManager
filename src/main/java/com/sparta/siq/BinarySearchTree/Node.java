package com.sparta.siq.BinarySearchTree;

public class Node {

    private int value;
    private Node parent;
    private Node leftChild;
    private Node rightChild;

    public Node()
    {

    }

    public Node(int value)
    {
        this.value = value;
    }

    public Node(Node parent,int value)
    {
        this.parent = parent;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
