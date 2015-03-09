package org.hpds.expressionEvaluator.expressions;

import org.hpds.expressionEvaluator.Expression;

import java.lang.reflect.InvocationTargetException;

public class Divide extends BinaryOperator {

    public Divide(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return evaluate("Divition");
    }

    @Override
    public String type() {
        return null;
    }
}
