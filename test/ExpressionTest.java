import org.hpds.expressionevaluator.Evaluable;
import org.hpds.expressionevaluator.expressions.*;
import org.hpds.expressionevaluator.operations.DoubleDoubleAddition;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ExpressionTest {

    @Test
    public void  withOneExpressionConstant() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Evaluable constant = new Constant(3);
        assertThat(constant.value(), is(3));
        assertTrue("Integer".equals(constant.type()));
    }
    @Test
    public void withIntegerIntegerAddition() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Evaluable binaryOperation = new Add(new Constant(3), new Constant(4));
        assertThat(binaryOperation.value(), is(7));
        assertTrue("Integer".equals(binaryOperation.type()));
    }
    @Test
    public void withIntegerDoubleAddition() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Operator binaryOperation = new Add(new Constant(3), new Constant(4.5));
        assertThat(binaryOperation.value(), is(7.5));
        assertTrue("Double".equals(binaryOperation.type()));
    }
    @Test
    public void withSubtract() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Operator binaryOperation = new Subtract(new Constant(5), new Constant(4));
        assertThat(binaryOperation.value(), is(1));
    }
    @Test
    public void withMultiplication() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Operator binaryOperation = new Multiplicate(new Constant(2), new Constant(4));
        assertThat(binaryOperation.value(), is(8));
    }

    @Test
    public void withDivision() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Operator binaryOperation = new Divide(new Constant(8), new Constant(2));
        assertThat(binaryOperation.value(), is(4));
    }
    @Test
    public void withTwoOperations() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Operator binaryOperation2 = new Subtract(new Constant(2), new Constant(1));
        Operator binaryOperation = new Add(binaryOperation2, new Constant(5));
        assertThat(binaryOperation.value(), is(6));
    }
    @Test
    public void withThreeOperations() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Operator binaryOperation2 = new Subtract(new Constant(2), new Constant(1));
        Operator binaryOperation3 = new Add(new Constant(1), new Constant(3));
        Operator binaryOperation = new Subtract(binaryOperation3, binaryOperation2);
        assertThat(binaryOperation.value(), is(3));
    }

}