package org.hpds.expressionEvaluator.expressions;

import org.hpds.expressionEvaluator.Expression;
import java.lang.reflect.InvocationTargetException;

public class Subtract extends BinaryOperator {

    public Subtract(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return evaluate("Subtraction");
    }

    @Override
    public String type() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return typeOf(value());
    }
}
