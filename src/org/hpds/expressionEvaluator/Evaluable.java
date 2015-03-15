package org.hpds.expressionevaluator;

public interface Evaluable {

    public Object value() throws ReflectiveOperationException;

    public String type() throws ReflectiveOperationException;
}
