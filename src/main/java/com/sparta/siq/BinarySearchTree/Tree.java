package com.sparta.siq.BinarySearchTree;


import java.util.ArrayList;
import java.util.List;

public class Tree implements BinaryTree {

    private Node root;
    private boolean valueFound = false;
    private int LeftValue = 0;
    private int rightValue = 0;
    private int numberOfElements = 0;
    private List<Integer> list = new ArrayList<>();


    @Override
    public int getRootElement() {
        return root.getValue();
    }

    @Override
    public int getNumberOfElements() {

        if (root != null) {
            return getNumberOfNodes(root);
        } else {
            return 0;
        }
    }

    @Override
    public void addElement(int element) {

        if (root == null) {
            root = new Node(element);
        } else {
            insertNode(root, element);
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            if (root == null) {
                root = new Node(elements[0]);
            } else {
                insertNode(root, elements[i]);
            }
        }
    }

    @Override
    public boolean findElement(int value) {

        if (root.getValue() == value) {
            valueFound = true;
        } else {
            findNode(root, value);
        }
        return valueFound;
    }


    @Override
    public int getLeftChild(int element) {
        return getLeft(root, element);
    }

    @Override
    public int getRightChild(int element) {
        return getRight(root, element);
    }

    @Override
    public List<Integer> getSortedTreeAsc() {
        list.clear();
        getLeastToRight(root);
        return list;
    }

    @Override
    public List<Integer> getSortedTreeDesc() {
        list.clear();
        getHighestToLeast(root);
        return list;
    }

    private void insertNode(Node node, int element) {

        if (element < node.getValue()) {
            if (node.getLeftChild() != null) {
                insertNode(node.getLeftChild(), element);
            } else {
                node.setLeftChild(new Node(element));
            }
        } else if (element > node.getValue()) {
            if (node.getRightChild() != null) {
                insertNode(node.getRightChild(), element);
            } else {
                node.setRightChild(new Node(element));
            }
        }
    }

    private boolean findNode(Node node, int element) {

        if (node != null && node.getValue() < element) {

            findNode(node.getRightChild(), element);
        } else if (node != null && node.getValue() > element) {
            findNode(node.getLeftChild(), element);
        } else if (node != null && node.getValue() == element) {
            valueFound = true;
        }
        return valueFound;
    }

    private int getLeft(Node node, int element) {

        if (node != null && node.getValue() > element) {
            getLeft(node.getLeftChild(), element);
        } else if (node != null && node.getValue() < element) {
            getLeft(node.getRightChild(), element);
        } else if (node.getLeftChild() != null) {
            LeftValue = node.getLeftChild().getValue();
        }
        return LeftValue;
    }

    private int getRight(Node node, int element) {

        if (node != null && node.getValue() < element) {
            getRight(node.getRightChild(), element);
        } else if (node != null && node.getValue() > element) {
            getRight(node.getLeftChild(), element);
        } else if (node.getRightChild() != null) {
            rightValue = node.getRightChild().getValue();
        }
        return rightValue;
    }

    private int getNumberOfNodes(Node node) {

        numberOfElements++;

        if (node.getLeftChild() != null) {
            getNumberOfNodes(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            getNumberOfNodes(node.getRightChild());
        }
        return numberOfElements;
    }

    private List<Integer> getLeastToRight(Node node) {
        if (node != null) {
            if (node.getLeftChild() != null) {
                getLeastToRight(node.getLeftChild());
            }
            list.add(node.getValue());
            if (node.getRightChild() != null) {
                getLeastToRight(node.getRightChild());
            }
        }
        return list;
    }

    private List<Integer> getHighestToLeast(Node node) {
        if (node != null) {
            if (node.getRightChild() != null) {
                getHighestToLeast(node.getRightChild());
            }

            list.add(node.getValue());
            if (node.getLeftChild() != null) {
                getHighestToLeast(node.getLeftChild());
            }
        }
        return list;
    }

}



