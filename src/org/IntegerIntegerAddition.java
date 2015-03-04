package org;

public class IntegerIntegerAddition extends Addition{


    public IntegerIntegerAddition(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate(){
        return (Integer) leftChild.evaluate() + (Integer) rightChild.evaluate();
    }

    @Override
    public String type() {
        return "Integer";
    }
}
