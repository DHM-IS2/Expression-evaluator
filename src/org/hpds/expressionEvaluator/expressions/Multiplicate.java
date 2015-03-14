package org.hpds.expressionevaluator.expressions;

import org.hpds.expressionevaluator.Expression;

import java.lang.reflect.InvocationTargetException;

public class Multiplicate extends BinaryOperator {

    public Multiplicate(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return evaluate("Multiplication");
    }

    @Override
    public String type() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return typeOf(value());
    }
}
