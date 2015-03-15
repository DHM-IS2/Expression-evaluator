package org.hpds.expressionevaluator.expressions;

import org.hpds.expressionevaluator.Expression;

public class Divide extends BinaryOperator {

    public Divide(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ReflectiveOperationException {
        return evaluate("Division");
    }

    @Override
    public String type() {
        return "Division";
    }
}