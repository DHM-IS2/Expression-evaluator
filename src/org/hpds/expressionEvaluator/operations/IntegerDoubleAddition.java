package org.hpds.expressionEvaluator.operations;

import java.lang.reflect.InvocationTargetException;

public class IntegerDoubleAddition extends BinaryOperation {

    public IntegerDoubleAddition(Object leftValue, Object rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Integer) getLeftChild() + (Double) getRightChild();
    }

    @Override
    public String type() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return "Double";
    }
}
