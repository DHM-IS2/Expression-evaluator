public abstract class Operation implements Expression{

    protected final Expression leftChild;
    protected final Expression rightChild;

    public Operation(Expression leftValue, Expression rightValue){
        this.leftChild = leftValue;
        this.rightChild = rightValue;
    }

    @Override
    public abstract double evaluate();
}
