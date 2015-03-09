package org.hpds.expressionEvaluator.expressions;

import org.hpds.expressionEvaluator.Expression;
import org.hpds.expressionEvaluator.operations.BinaryOperation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class BinaryOperator extends Operator{

    private final Expression leftChild;
    private final Expression rightChild;

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
        Class<BinaryOperation> binaryOperation = (Class<BinaryOperation>) ClassLoader.getSystemClassLoader().loadClass(typeOf(getLeftChild()) + typeOf(getRightChild()) + operation);
        Constructor<BinaryOperation> constructor = binaryOperation.getConstructor(Object.class, Object.class);
        return constructor.newInstance(evaluateOperand(leftChild), evaluateOperand(rightChild)).value();
    }
}
