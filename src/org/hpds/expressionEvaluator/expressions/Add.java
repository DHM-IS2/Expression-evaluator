package org.hpds.expressionevaluator.expressions;

import org.hpds.expressionevaluator.Expression;


public class Add extends BinaryOperator {

    public Add(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    public Object value() throws ReflectiveOperationException {
        return evaluate("Addition");
    }

    public String type() throws ReflectiveOperationException {
        return typeOf(value());
    }
}