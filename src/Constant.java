public class Constant extends Expression{

    private double value;

    public Constant(double value){
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
