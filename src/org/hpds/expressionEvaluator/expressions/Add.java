package org.hpds.expressionevaluator.expressions;

import org.hpds.expressionevaluator.Expression;

import java.lang.reflect.InvocationTargetException;


public class Add extends BinaryOperator {

    public Add(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return evaluate("Addition");
    }

    public String type() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return typeOf(value());
    }
}