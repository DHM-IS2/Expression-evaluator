package org.hpds.expressionEvaluator.operations;

import java.lang.reflect.InvocationTargetException;

public class DoubleIntegerAddition extends BinaryOperation {

    public DoubleIntegerAddition(Object leftValue, Object rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftChild() + (Integer) getRightChild();
    }

    @Override
    public String type() {
        return "Double";
    }
}
