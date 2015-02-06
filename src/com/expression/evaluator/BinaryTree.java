package com.expression.evaluator;

public class BinaryTree {

    private Node node;

    public BinaryTree(String string) {
        node = new Node(string);
        node.setString(string);
    }

    public class Node{

        private Node leftChild, rightChild;
        private String string;

        public Node(String string){
            this.string = string;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }
    }

    public void addLeftNode(String string){
        if (node == null){
            node = new Node(string);
        }
        else{
            node.leftChild = new Node(string);
        }
    }

    public void addRightNode(String string){
        if (node == null){
            node = new Node(string);
        }
        else{
            node.rightChild = new Node(string);
        }
    }

    public Node getNode() {
        return node;
    }

}
