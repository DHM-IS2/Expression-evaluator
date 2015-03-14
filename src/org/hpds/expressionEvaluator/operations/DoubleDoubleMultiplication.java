package org.hpds.expressionevaluator.operations;

import org.hpds.expressionevaluator.Expression;

import java.lang.reflect.InvocationTargetException;

public class DoubleDoubleMultiplication extends BinaryOperation {

    public DoubleDoubleMultiplication(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftChild() * (Double) getRightChild();
    }

    @Override
    public String type() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return "Double";
    }
}
