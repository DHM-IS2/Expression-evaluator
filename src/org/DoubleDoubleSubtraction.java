package org;

/**
 * Created by Pepe on 04/03/2015.
 */
public class DoubleDoubleSubtraction extends Division{

    public DoubleDoubleSubtraction(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate() {
        return (Double) leftChild.evaluate() - (Double) rightChild.evaluate();
    }

    @Override
    public String type() {
        return "Double";
    }
}
