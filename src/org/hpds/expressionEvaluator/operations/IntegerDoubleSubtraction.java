package org.hpds.expressionEvaluator.operations;

import org.hpds.expressionEvaluator.expressions.Divide;
import org.hpds.expressionEvaluator.Expression;

/**
 * Created by Pepe on 04/03/2015.
 */
public class IntegerDoubleSubtraction extends Divide {

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
