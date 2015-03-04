import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class Addition extends Operation{

    public Addition(Expression leftValue, Expression rightValue) {
        super(leftValue, rightValue);
    }

    public abstract Object evaluate();

    public abstract String type();

    public static Operation execute(Expression leftValue, Expression rightValue) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println("org."+leftValue.type()+rightValue.type()+"Addition");
        Class operationClass = ClassLoader.getSystemClassLoader().getClass().getClassLoader().loadClass("org."
                +leftValue.type()+rightValue.type()+"Addition");
        Constructor<Operation> operationConstructor = operationClass.getConstructor(Object.class, Object.class);
        return operationConstructor.newInstance(leftValue, rightValue);
    }
}