package org.hpds.expressionevaluator.operations;

import java.lang.reflect.InvocationTargetException;

public class DoubleDoubleSubtraction extends BinaryOperation {

    public DoubleDoubleSubtraction(Object leftValue, Object rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftChild() - (Double) getRightChild();
    }

    @Override
    public String type() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return "Double";
    }
}
