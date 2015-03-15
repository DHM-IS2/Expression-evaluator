package org.hpds.expressionevaluator.expressions;

import org.hpds.expressionevaluator.Evaluable;
import org.hpds.expressionevaluator.Expression;

import java.lang.reflect.InvocationTargetException;

public class Constant implements Expression, Evaluable {
    private Object value;

    public Constant(Object value) {
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