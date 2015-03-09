package org.hpds.expressionEvaluator.expressions;

import org.hpds.expressionEvaluator.Evaluable;
import org.hpds.expressionEvaluator.Expression;

import java.lang.reflect.InvocationTargetException;

public abstract class Operator implements Expression, Evaluable{

    public String typeOf(Object operand) {
        return operand.getClass().getName();
    }

    public Evaluable evaluable(Expression expression){
        return (Evaluable) expression;
    }

    public Object evaluateOperand(Expression expression) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        return isEvaluable(expression) ? evaluable(expression).value() : nullEvaluable();
    }

    public boolean isEvaluable(Expression expression){
        return expression instanceof Evaluable;
    }

    private Object nullEvaluable() {
        return new Evaluable() {
            @Override
            public Object value() {
                return null;
            }

            @Override
            public String type() {
                return "NaN";
            }
        };
    }
}
