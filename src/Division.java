public class Division extends Operation{

    public Division(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    public double evaluate (){
        return leftChild.evaluate() / rightChild.evaluate();
    }
}
