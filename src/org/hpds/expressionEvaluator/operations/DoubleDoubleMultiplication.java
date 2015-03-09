package org.hpds.expressionEvaluator.operations;

import org.hpds.expressionEvaluator.expressions.Divide;
import org.hpds.expressionEvaluator.Expression;

/**
 * Created by Pepe on 04/03/2015.
 */
public class DoubleDoubleMultiplication extends Divide {

    public DoubleDoubleMultiplication(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate() {
        return (Double) leftChild.evaluate() * (Double) rightChild.evaluate();
    }

    @Override
    public String type() {
        return "Double";
    }
}