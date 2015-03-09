package org.hpds.expressionEvaluator.operations;

import org.hpds.expressionEvaluator.Expression;
import org.hpds.expressionEvaluator.expressions.Add;

public class DoubleDoubleAddition extends Add {

    public DoubleDoubleAddition(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate() {
        return (Double) leftChild.evaluate() + (Double) rightChild.evaluate();
    }

    @Override
    public String type() {
        return "Double";
    }
}
