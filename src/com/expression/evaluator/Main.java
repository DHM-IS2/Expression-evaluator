package com.expression.evaluator;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree("8");
        System.out.println(tree.getNode().getString());
        tree.addLeftNode("10");
        System.out.println(tree.getNode().getLeftChild().getString());
        tree.addRightNode("10");
        System.out.println(tree.getNode().getRightChild().getString());
    }
}
