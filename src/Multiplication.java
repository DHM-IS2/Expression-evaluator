public class Multiplication extends Operation{

    public Multiplication(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    public double evaluate (){
        return leftChild.evaluate() * rightChild.evaluate();
    }
}
