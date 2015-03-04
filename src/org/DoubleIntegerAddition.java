package org;

public class DoubleIntegerAddition extends Addition{

    public DoubleIntegerAddition(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate() {
        return (Double) leftChild.evaluate() + (Integer) rightChild.evaluate();
    }

    @Override
    public String type() {
        return "Double";
    }
}
