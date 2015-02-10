public class Operation extends Expression{

    private final char operator;
    private final Expression rightChild;
    private final Expression leftChild;

    public Operation(char operator, Expression leftValue, Expression rightValue){
        this.operator = operator;
        this.leftChild = leftValue;
        this.rightChild = rightValue;
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
