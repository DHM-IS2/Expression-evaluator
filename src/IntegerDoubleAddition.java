public class IntegerDoubleAddition extends Addition{


    public IntegerDoubleAddition(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    @Override
    public Object evaluate() {
        return (Integer) leftChild.evaluate() + (Double) rightChild.evaluate();
    }

    @Override
    public String type() {
        return "Double";
    }
}
