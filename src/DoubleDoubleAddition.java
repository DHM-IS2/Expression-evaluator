public class DoubleDoubleAddition extends Addition{

    public DoubleDoubleAddition(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate() {
        return (Double) leftChild.evaluate() + (Double) rightChild.evaluate();
    }

    @Override
    public String type() {
        return "Double";
    }
}
