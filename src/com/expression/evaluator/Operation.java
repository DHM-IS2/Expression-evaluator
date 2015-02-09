package com.expression.evaluator;

public class Operation {

    private final String operator;
    private final Expression rightChild;
    private final Expression leftChild;

    public Operation(String operator, Expression leftChild, Expression rightChild) {
        this.operator = operator;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

        public Expression getLeftChild() {
            return leftChild;
        }

        public Expression getRightChild() {
            return rightChild;
        }

}
