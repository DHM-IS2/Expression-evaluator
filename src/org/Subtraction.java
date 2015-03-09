package org;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Subtraction extends Operation{

    public Subtraction(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    public Object evaluate (){
        return null;
    }

    @Override
    public String type() {
        return null;
    }
    @SuppressWarnings("unchecked")
    public static Operation execute(Expression leftValue, Expression rightValue) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Operation> operationClass = (Class<Operation>)ClassLoader.getSystemClassLoader().loadClass("org."+leftValue.type()+rightValue.type()+"Subtraction");
        Constructor<Operation> operationConstructor = operationClass.getConstructor(Expression.class, Expression.class);
        return operationConstructor.newInstance(leftValue, rightValue);
    }
}