package org.hpds.expressionevaluator.operations;


import java.lang.reflect.InvocationTargetException;

public class DoubleIntegerDivision extends BinaryOperation {

    public DoubleIntegerDivision(Object leftValue, Object rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Double) getLeftChild() / (Integer) getRightChild();
    }

    @Override
    public String type() {
        return "Double";
    }
}
