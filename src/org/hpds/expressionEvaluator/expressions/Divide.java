package org.hpds.expressionevaluator.expressions;

import org.hpds.expressionevaluator.Expression;

import java.lang.reflect.InvocationTargetException;

public class Divide extends BinaryOperator {

    public Divide(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return evaluate("Division");
    }

    @Override
    public String type() {
        return "Division";
    }
}