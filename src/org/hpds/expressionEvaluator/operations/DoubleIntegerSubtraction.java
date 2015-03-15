package org.hpds.expressionevaluator.operations;

import java.lang.reflect.InvocationTargetException;

public class DoubleIntegerSubtraction extends BinaryOperation {

    public DoubleIntegerSubtraction(Object leftValue, Object rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftChild() - (Integer) getRightChild();
    }

    @Override
    public String type() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return "Double";
    }
}
