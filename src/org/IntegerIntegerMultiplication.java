package org;

/**
 * Created by Pepe on 04/03/2015.
 */
public class IntegerIntegerMultiplication extends Division{

    public IntegerIntegerMultiplication(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate() {
        return (Integer) leftChild.evaluate() * (Integer) rightChild.evaluate();
    }

    @Override
    public String type() {
        return "Integer";
    }
}
