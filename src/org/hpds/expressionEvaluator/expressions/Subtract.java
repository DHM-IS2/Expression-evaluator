package org.hpds.expressionevaluator.expressions;

import org.hpds.expressionevaluator.Expression;

public class Subtract extends BinaryOperator {

    public Subtract(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ReflectiveOperationException {
        return evaluate("Subtraction");
    }

    @Override
    public String type() throws ReflectiveOperationException {
        return typeOf(value());
    }
}
