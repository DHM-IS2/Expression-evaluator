package org.hpds.expressionEvaluator.expressions;

import org.hpds.expressionEvaluator.Evaluable;
import org.hpds.expressionEvaluator.Expression;

import java.lang.reflect.InvocationTargetException;

public class Constant implements Expression, Evaluable {

    private Object value;

    public Constant(Object value){
        this.value = value;
    }

    @Override
    public Object value() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return value;
    }

    @Override
    public String type() {
        return value.getClass().getSimpleName();
    }
}