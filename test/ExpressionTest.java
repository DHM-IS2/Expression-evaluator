import org.hpds.expressionEvaluator.expressions.*;
import org.hpds.expressionEvaluator.operations.BinaryOperation;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class ExpressionTest {

    @Test
    public void  withOneExpressionConstant(){
        Constant constant = new Constant(3);
        assertThat(constant.evaluate(), is(3));
        assertTrue("Integer".equals(constant.type()));
    }

    @Test
    public void withIntegerIntegerAddition() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        BinaryOperation binaryOperation = org.hpds.expressionEvaluator.expressions.Add.execute(new Constant(3), new Constant(4));
        assertThat(binaryOperation.evaluate(), is(7));
        assertTrue("Integer".equals(binaryOperation.type()));
    }
    @Test
    public void withIntegerDoubleAddition() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        BinaryOperation binaryOperation = org.hpds.expressionEvaluator.expressions.Add.execute(new Constant(3), new Constant(4.5));
        assertThat(binaryOperation.evaluate(), is(7.5));
        assertTrue("Double".equals(binaryOperation.type()));
    }
    @Test
    public void withSubtract() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BinaryOperation binaryOperation = Subtract.execute(new Constant(5), new Constant(4));
        assertThat(binaryOperation.evaluate(), is(1));
    }
    @Test
    public void withMultiplication() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BinaryOperation binaryOperation = Multiplicate.execute(new Constant(2), new Constant(4));
        assertThat(binaryOperation.evaluate(), is(8));
    }
    //TODO
    public void withDivision() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BinaryOperation binaryOperation = Divide.execute(new Constant(9), new Constant(2));
        assertThat(binaryOperation.evaluate(), is(4.5));
    }
    @Test
    public void withTwoOperations() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BinaryOperation binaryOperation2 = Subtract.execute(new Constant(2), new Constant(1));
        BinaryOperation binaryOperation = org.hpds.expressionEvaluator.expressions.Add.execute(binaryOperation2, new Constant(5));
        assertThat(binaryOperation.evaluate(), is(6));
    }
    @Test
    public void withThreeOperations() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BinaryOperation binaryOperation2 = Subtract.execute(new Constant(2), new Constant(1));
        BinaryOperation binaryOperation3 = org.hpds.expressionEvaluator.expressions.Add.execute(new Constant(1), new Constant(3));
        BinaryOperation binaryOperation = Subtract.execute(binaryOperation3, binaryOperation2);
        assertThat(binaryOperation.evaluate(), is(3));
    }
    @Test
    public void withDifferentTypes() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        BinaryOperation binaryOperation1 = org.hpds.expressionEvaluator.expressions.Add.execute(new Constant(3), new Constant(2));
        assertTrue(Integer.class.isInstance(binaryOperation1.evaluate()));
    }

}

