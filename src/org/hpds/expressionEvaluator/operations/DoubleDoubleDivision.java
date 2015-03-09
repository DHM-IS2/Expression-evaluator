package org.hpds.expressionEvaluator.operations;

import java.lang.reflect.InvocationTargetException;

public class DoubleDoubleDivision extends BinaryOperation {

    public DoubleDoubleDivision(Object leftValue, Object rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftChild() / (Double) getRightChild();
    }

    @Override
    public String type() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return "Double";
    }
}
