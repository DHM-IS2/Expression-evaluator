public class Constant implements Expression{

    protected double value;

    public Constant(double value){
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}