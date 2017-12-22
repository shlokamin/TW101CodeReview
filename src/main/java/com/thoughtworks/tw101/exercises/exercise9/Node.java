package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

// This code implements the Node class and the add() and names() methods.

public class Node {
    private String name;
    private Node leftChild;
    private Node rightChild;

    public Node(String name) {
        this.name = name;
        leftChild = null;
        rightChild = null;
    }

    public void add(String nameOfNewNode) {
        // finds the proper place to add a Node in the tree
        if (nameOfNewNode.compareTo(name) == 0) {
            System.out.println("Cannot insert duplicate tree entry.");
        }

        else if (nameOfNewNode.compareTo(name) < 0) { // if node to add comes before current node in alphabet
            if (leftChild == null) { // can create new node and insert
                leftChild = new Node(nameOfNewNode);
            }
            else { // need to keep traversing tree
                leftChild.add(nameOfNewNode);
            }
        }

        else { // node to add comes after current node in alphabet
            if (rightChild == null) {
                rightChild = new Node(nameOfNewNode);
            }
            else { // need to keep traversing tree
                rightChild.add(nameOfNewNode);
            }
        }

    }

    public List<String> names() {
        // wrapper for inOrderTraversal()
        List<String> allNodes = new ArrayList<String>(); // why doesn't this work if it's a private instance?
        inOrderTraversal(allNodes);

        return allNodes;

    }

    private void inOrderTraversal(List<String> allNodes) {
        // performs an in-order traversal of the tree
        if (leftChild != null) {
            leftChild.inOrderTraversal(allNodes);
        }

        allNodes.add(name);

        if (rightChild != null) {
            rightChild.inOrderTraversal(allNodes);
        }

    }

}
