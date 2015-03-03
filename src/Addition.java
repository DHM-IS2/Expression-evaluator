public abstract class Addition extends Operation{

    public Addition(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    public abstract Object evaluate();

    public abstract String type();

    public static Operation execute(Expression leftValue, Expression rightValue){
        if (leftValue.type().equals("Integer") && rightValue.type().equals("Integer")) {
            return new IntegerIntegerAddition(leftValue, rightValue);
        }
        else if (leftValue.type() == "Double" && rightValue.type() == "Integer")
            return new DoubleIntegerAddition(leftValue, rightValue);
        else if (leftValue.type() == "Integer" && rightValue.type() == "Double")
            return new IntegerDoubleAddition(leftValue, rightValue);
        else if (leftValue.type() == "Double" && rightValue.type() == "Double")
            return new DoubleDoubleAddition(leftValue, rightValue);
        return  null;
    }
}

