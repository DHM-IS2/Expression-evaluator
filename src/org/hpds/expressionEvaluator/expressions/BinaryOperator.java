package org.hpds.expressionevaluator.expressions;

import org.hpds.expressionevaluator.Expression;
import org.hpds.expressionevaluator.operations.BinaryOperation;

public abstract class BinaryOperator extends Operator {

    protected final Expression leftChild;
    protected final Expression rightChild;
    private final String OPERATIONS_PACKAGE = "org.hpds.expressionevaluator.operations.";

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

    public Object evaluate(String operation) throws ReflectiveOperationException {
        return loadBinaryOperationClass(operation).getConstructor(Object.class, Object.class).newInstance(getOperands()).value();
    }

    private Object[] getOperands() throws ReflectiveOperationException {
        return new Object[]{evaluateOperand(leftChild), evaluateOperand(rightChild)};
    }

    private Class<BinaryOperation> loadBinaryOperationClass(String operation) throws ReflectiveOperationException {
        return (Class<BinaryOperation>) loadClass(operation);
    }

    private Class<?> loadClass(String operation) throws ReflectiveOperationException {
        return ClassLoader.getSystemClassLoader().loadClass(OPERATIONS_PACKAGE + getBinaryOperationClassName(operation));
    }

    private String getBinaryOperationClassName(String operation) throws ReflectiveOperationException {
        return typeOf(evaluateOperand(getLeftChild())) + typeOf(evaluateOperand(getRightChild())) + operation;
    }
}
