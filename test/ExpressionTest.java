import org.*;
import org.hamcrest.core.Is;
import org.junit.Ignore;
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
        Operation operation = Addition.execute(new Constant(3), new Constant(4));
        assertThat(operation.evaluate(), is(7));
        assertTrue("Integer".equals(operation.type()));
    }
    @Test
    public void withIntegerDoubleAddition() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Operation operation = Addition.execute(new Constant(3), new Constant(4.5));
        assertThat(operation.evaluate(), is(7.5));
        assertTrue("Double".equals(operation.type()));
    }
    @Test
    public void withSubtract() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Operation operation = Subtraction.execute(new Constant(5), new Constant(4));
        assertThat(operation.evaluate(), is(1));
    }
    @Test
    public void withMultiplication() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Operation operation = Multiplication.execute(new Constant(2), new Constant(4));
        assertThat(operation.evaluate(), is(8));
    }
    //TODO
    public void withDivision() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Operation operation = Division.execute(new Constant(9),new Constant(2));
        assertThat(operation.evaluate(), is(4.5));
    }
    @Test
    public void withTwoOperations() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Operation operation2 = Subtraction.execute(new Constant(2), new Constant(1));
        Operation operation = Addition.execute(operation2 ,new Constant(5));
        assertThat(operation.evaluate(), is(6));
    }
    @Test
    public void withThreeOperations() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Operation operation2 = Subtraction.execute(new Constant(2),new Constant(1));
        Operation operation3 = Addition.execute(new Constant(1),new Constant(3));
        Operation operation = Subtraction.execute(operation3 ,operation2);
        assertThat(operation.evaluate(), is(3));
    }
    @Test
    public void withDifferentTypes() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Operation operation1 = Addition.execute(new Constant(3), new Constant(2));
        assertTrue(Integer.class.isInstance(operation1.evaluate()));
    }

}

