package org;

/**
 * Created by Pepe on 04/03/2015.
 */
public class IntegerDoubleSubtraction extends Division{

    public IntegerDoubleSubtraction(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate() {
        return (Integer) leftChild.evaluate() - (Double) rightChild.evaluate();
    }

    @Override
    public String type() {
        return "Double";
    }
}