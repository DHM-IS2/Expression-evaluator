package org;

/**
 * Created by Pepe on 04/03/2015.
 */
public class DoubleIntegerDivision extends Division{

    public DoubleIntegerDivision(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate() {
        return (Double) leftChild.evaluate() / (Integer) rightChild.evaluate();
    }

    @Override
    public String type() {
        return "Double";
    }
}
