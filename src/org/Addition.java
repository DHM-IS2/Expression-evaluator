package org;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class Addition extends Operation{

    public Addition(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    public abstract Object evaluate();

    public abstract String type();

    @SuppressWarnings("unchecked")
    public static Operation execute(Expression leftValue, Expression rightValue) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Operation> operationClass = (Class<Operation>)ClassLoader.getSystemClassLoader().loadClass("org."+leftValue.type()+rightValue.type()+"Addition");
        Constructor<Operation> operationConstructor = operationClass.getConstructor(Expression.class, Expression.class);
        return operationConstructor.newInstance(leftValue, rightValue);
    }
}