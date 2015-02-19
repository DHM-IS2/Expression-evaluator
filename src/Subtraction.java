public class Subtraction extends Operation{

    public Subtraction(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    public double evaluate (){
        return leftChild.evaluate() - rightChild.evaluate();
    }
}
