public class Constant implements Expression{

    protected Object value;

    public Constant(Object value){
        this.value = value;
    }

    @Override
    public Object evaluate() {
        return value;
    }

    @Override
    public String type() {
        return value.getClass().getSimpleName();
    }
}