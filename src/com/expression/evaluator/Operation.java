package com.expression.evaluator;

public class Operation extends Expression{

    private final char operator;
    private final Expression rightChild;
    private final Expression leftChild;

    public Operation(char operator, int leftValue, int rightValue){
        this.operator = operator;
        this.leftChild = new Constant(leftValue);
        this.rightChild = new Constant(rightValue);
    }

    @Override
    public double evaluate() {
        if (operator == '-')
            return leftChild.evaluate() - rightChild.evaluate();
        else if (operator == '+')
            return leftChild.evaluate() + rightChild.evaluate();
        return 0.0;
    }
}
