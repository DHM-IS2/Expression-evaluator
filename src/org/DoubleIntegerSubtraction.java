package org;

/**
 * Created by Pepe on 04/03/2015.
 */
public class DoubleIntegerSubtraction extends Division{

    public DoubleIntegerSubtraction(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate() {
        return (Double) leftChild.evaluate() - (Integer) rightChild.evaluate();
    }

    @Override
    public String type() {
        return "Double";
    }
}
