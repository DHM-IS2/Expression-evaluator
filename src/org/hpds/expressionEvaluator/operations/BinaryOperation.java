package org.hpds.expressionevaluator.operations;

import org.hpds.expressionevaluator.Evaluable;

public abstract class BinaryOperation implements Evaluable {

    protected Object leftChild;
    protected Object rightChild;

    public BinaryOperation(Object leftValue, Object rightValue) {
        this.leftChild = leftValue;
        this.rightChild = rightValue;
    }

    public Object getLeftChild() {
        return leftChild;
    }

    public Object getRightChild() {
        return rightChild;
    }
}
