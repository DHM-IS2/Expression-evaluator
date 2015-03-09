package org.hpds.expressionEvaluator.operations;

import org.hpds.expressionEvaluator.Expression;
import org.hpds.expressionEvaluator.expressions.Add;

public class IntegerIntegerAddition extends Add {


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
