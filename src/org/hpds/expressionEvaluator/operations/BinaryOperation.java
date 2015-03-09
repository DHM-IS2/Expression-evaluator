package org.hpds.expressionEvaluator.operations;

import org.hpds.expressionEvaluator.Evaluable;
import org.hpds.expressionEvaluator.Expression;

public abstract class BinaryOperation implements Evaluable {

    protected Expression leftChild;
    protected Expression rightChild;

    public BinaryOperation(Expression leftValue, Expression rightValue){
        this.leftChild = leftValue;
        this.rightChild = rightValue;
    }

    public abstract Object evaluate();

    public abstract String type();
}
