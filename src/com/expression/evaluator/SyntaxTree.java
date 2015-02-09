package com.expression.evaluator;

public class SyntaxTree {
    Expression root;
    int expressionCount;

    public SyntaxTree(Expression root) {
        this.root = root;
        this.expressionCount=1;

    }
    public SyntaxTree() {
        this.root = root;
        this.size=1;
    }
}
