public class Addition extends Operation{

    public Addition(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    public double evaluate (){
        return leftChild.evaluate() + rightChild.evaluate();
    }
}
