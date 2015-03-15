package org.hpds.expressionevaluator.expressions;

import org.hpds.expressionevaluator.Expression;

public class Multiplicate extends BinaryOperator {

    public Multiplicate(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ReflectiveOperationException {
        return evaluate("Multiplication");
    }

    @Override
    public String type() throws ReflectiveOperationException {
        return typeOf(value());
    }
}
