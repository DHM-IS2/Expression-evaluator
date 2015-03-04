package org;

/**
 * Created by Pepe on 04/03/2015.
 */
public class IntegerIntegerDivision extends Division{

    public IntegerIntegerDivision(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate() {
        double v = (Double)leftChild.evaluate() / (Double) rightChild.evaluate();
        if (v % 1 == 0)
            return v;
        return v;

    }

    @Override
    public String type() {
        return "Integer";
    }
}