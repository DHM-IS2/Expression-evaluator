package org.hpds.expressionevaluator.operations;

import java.lang.reflect.InvocationTargetException;

public class IntegerIntegerMultiplication extends BinaryOperation {

    public IntegerIntegerMultiplication(Object leftValue, Object rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Integer) getLeftChild() * (Integer) getRightChild();
    }

    @Override
    public String type() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return "Integer";
    }
}
