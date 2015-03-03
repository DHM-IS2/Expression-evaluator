public abstract class Operation implements Expression{

    protected Expression leftChild;
    protected Expression rightChild;

    public Operation(Expression leftValue, Expression rightValue){
        this.leftChild = leftValue;
        this.rightChild = rightValue;
    }

    public abstract Object evaluate();

    public abstract String type();
}
