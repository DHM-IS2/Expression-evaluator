package org.hpds.expressionevaluator.expressions;

import org.hpds.expressionevaluator.Expression;
import org.hpds.expressionevaluator.operations.BinaryOperation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class BinaryOperator extends Operator{

    protected final Expression leftChild;
    protected final Expression rightChild;

    public BinaryOperator(Expression leftChild, Expression rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Expression getLeftChild() {
        return leftChild;
    }

    public Expression getRightChild() {
        return rightChild;
    }

    public Object evaluate(String operation) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<BinaryOperation> binaryOperation = (Class<BinaryOperation>) ClassLoader.getSystemClassLoader().loadClass(
                "org.hpds.expressionevaluator.operations."+
                        typeOf(evaluateOperand(getLeftChild())) + typeOf(evaluateOperand(getRightChild()))+ operation);
        Constructor<BinaryOperation> constructor = binaryOperation.getConstructor(Object.class, Object.class);
        return constructor.newInstance(evaluateOperand(leftChild), evaluateOperand(rightChild)).value();
    }
}
